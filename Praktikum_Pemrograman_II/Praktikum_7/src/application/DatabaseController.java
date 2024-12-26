package application;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DatabaseController {
	@FXML private TextField namaPelangganField;
    @FXML private TextField emailPelangganField;
    @FXML private TextField teleponPelangganField;
    @FXML private TableView<Pelanggan> pelangganTable;
    @FXML private TableColumn<Pelanggan, String> namaColumn;
    @FXML private TableColumn<Pelanggan, String> emailColumn;
    @FXML private TableColumn<Pelanggan, String> teleponColumn;
    
    @FXML private TextField judulBukuField;
    @FXML private TextField penulisBukuField;
    @FXML private TextField hargaBukuField;
    @FXML private TextField stokBukuField;
    @FXML private TableView<Buku> bukuTable;
    @FXML private TableColumn<Buku, String> judulColumn;
    @FXML private TableColumn<Buku, String> penulisColumn;
    @FXML private TableColumn<Buku, String> hargaColumn;
    @FXML private TableColumn<Buku, String> stokColumn;
    
    @FXML private TextField jumlahPenjualanField;
    @FXML private TextField tanggalPenjualanField;
    @FXML private TextField IDPelangganField;
    @FXML private TextField IDBukuField;
    @FXML private TableView<Penjualan> penjualanTable;
    @FXML private TableColumn<Penjualan, String> jumlahColumn;
    @FXML private TableColumn<Penjualan, String> totalHargaColumn;
    @FXML private TableColumn<Penjualan, String> tanggalColumn;
    @FXML private TableColumn<Penjualan, String> IDPelangganColumn;
    @FXML private TableColumn<Penjualan, String> IDBukuColumn;
    
    private final ObservableList<Pelanggan> pelangganList = FXCollections.observableArrayList();
    private final ObservableList<Buku> bukuList = FXCollections.observableArrayList();
    private final ObservableList<Penjualan> penjualanList = FXCollections.observableArrayList();
    
    @FXML
	public void initialize() {
    	namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        teleponColumn.setCellValueFactory(new PropertyValueFactory<>("telepon"));
        
        judulColumn.setCellValueFactory(new PropertyValueFactory<>("judul"));
        penulisColumn.setCellValueFactory(new PropertyValueFactory<>("penulis"));
        hargaColumn.setCellValueFactory(new PropertyValueFactory<>("harga"));
        stokColumn.setCellValueFactory(new PropertyValueFactory<>("stok"));
        
        jumlahColumn.setCellValueFactory(new PropertyValueFactory<>("jumlah"));
        totalHargaColumn.setCellValueFactory(new PropertyValueFactory<>("totalHarga"));
        tanggalColumn.setCellValueFactory(new PropertyValueFactory<>("tanggal"));
        IDPelangganColumn.setCellValueFactory(new PropertyValueFactory<>("pelangganId"));
        IDBukuColumn.setCellValueFactory(new PropertyValueFactory<>("bukuId"));
        
        loadDataFromDatabase();
    }
    
    private void loadDataFromDatabase() {
    	pelangganList.clear();
    	try (Connection conn = DatabaseConnector.getConnection();
   		     Statement stmt = conn.createStatement();
   	         ResultSet rs = stmt.executeQuery("SELECT nama, email, telepon FROM pelanggan")) {
   	         while (rs.next()) {
   	        	 pelangganList.add(new Pelanggan(
   	        			 rs.getString("nama"),
   	                     rs.getString("email"),
   	                     rs.getString("telepon")
   	             ));
   	         }
   	         pelangganTable.setItems(pelangganList);
   	    } catch (SQLException e) {
   	    	e.printStackTrace();
   	    }
    	
    	bukuList.clear();
    	try (Connection conn = DatabaseConnector.getConnection();
      		     Statement stmt = conn.createStatement();
      	         ResultSet rs = stmt.executeQuery("SELECT judul, penulis, harga, stok FROM buku")) {
      	         while (rs.next()) {
      	        	 bukuList.add(new Buku(
      	        			 rs.getString("judul"),
      	                     rs.getString("penulis"),
      	                     rs.getInt("harga"),
      	                     rs.getInt("stok")
      	             ));
      	         }
      	         bukuTable.setItems(bukuList);
      	    } catch (SQLException e) {
      	    	e.printStackTrace();
      	    }
    	
    	penjualanList.clear();
    	try (Connection conn = DatabaseConnector.getConnection();
      		     Statement stmt = conn.createStatement();
      	         ResultSet rs = stmt.executeQuery("SELECT jumlah, total_harga, tanggal, pelanggan_id, buku_id FROM penjualan")) {
      	         while (rs.next()) {
      	        	 penjualanList.add(new Penjualan(
      	        			 rs.getInt("jumlah"),
      	                     rs.getInt("total_harga"),
      	                     rs.getString("tanggal"),
      	                     rs.getInt("pelanggan_id"),
      	                     rs.getInt("buku_id")
      	             ));
      	         }
      	         penjualanTable.setItems(penjualanList);
      	    } catch (SQLException e) {
      	    	e.printStackTrace();
      	    }
    }
    
    @FXML
    private void addPelanggan() {
    	try (Connection conn = DatabaseConnector.getConnection();
   			 PreparedStatement stmt = conn.prepareStatement("INSERT INTO pelanggan (nama, email, telepon) VALUES (?, ?, ?)")) {
   			stmt.setString(1, namaPelangganField.getText());
   	        stmt.setString(2, emailPelangganField.getText());
   	        stmt.setString(3, teleponPelangganField.getText());
   	        stmt.executeUpdate();
   	        loadDataFromDatabase();
   	        namaPelangganField.clear();
   	        emailPelangganField.clear();
   	        teleponPelangganField.clear();
   	   } catch (SQLException e) {
   		   e.printStackTrace();
   	   }
    }
    
    @FXML
    private void editPelanggan() {
    	Pelanggan selectedPelanggan = pelangganTable.getSelectionModel().getSelectedItem();
    	if (selectedPelanggan == null) {
    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	    alert.setTitle("Error");
    	    alert.setHeaderText(null);
    	    alert.setContentText("Pilih pelanggan yang ingin diupdate.");
    	    alert.showAndWait();
    	    return;
    	}
    	try (Connection conn = DatabaseConnector.getConnection();
   	         PreparedStatement stmt = conn.prepareStatement("UPDATE pelanggan SET nama = ?, email = ?, telepon = ? WHERE nama = ?")) {
    		stmt.setString(1, namaPelangganField.getText());
   	        stmt.setString(2, emailPelangganField.getText());
   	        stmt.setString(3, teleponPelangganField.getText());
   	        stmt.setString(4, selectedPelanggan.getNama());
   	        stmt.executeUpdate();
   	        loadDataFromDatabase();
   	        namaPelangganField.clear();
	        emailPelangganField.clear();
	        teleponPelangganField.clear();
   	    } catch (SQLException e) {
   	        e.printStackTrace();
   	    }
    }
    
    @FXML
    private void deletePelanggan() {
    	Pelanggan selectedPelanggan = pelangganTable.getSelectionModel().getSelectedItem();
    	if (selectedPelanggan == null) {
    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	    alert.setTitle("Error");
    	    alert.setHeaderText(null);
    	    alert.setContentText("Pilih pelanggan yang ingin dihapus.");
    	    alert.showAndWait();
    	    return;
    	}
    	try (Connection conn = DatabaseConnector.getConnection();
    		PreparedStatement stmt = conn.prepareStatement("DELETE FROM pelanggan WHERE nama = ?")) {
    		stmt.setString(1, selectedPelanggan.getNama());
            stmt.executeUpdate();
   	        loadDataFromDatabase();
   	    } catch (SQLException e) {
   	        e.printStackTrace();
   	    }
    }
    
    @FXML
    private void addBuku() {
    	try (Connection conn = DatabaseConnector.getConnection();
   			 PreparedStatement stmt = conn.prepareStatement("INSERT INTO buku (judul, penulis, harga, stok) VALUES (?, ?, ?, ?)")) {
   			stmt.setString(1, judulBukuField.getText());
   	        stmt.setString(2, penulisBukuField.getText());
   	        stmt.setInt(3, Integer.parseInt(hargaBukuField.getText()));
   	        stmt.setInt(4, Integer.parseInt(stokBukuField.getText()));
   	        stmt.executeUpdate();
   	        loadDataFromDatabase();
   	        judulBukuField.clear();
   	        penulisBukuField.clear();
   	        hargaBukuField.clear();
   	        stokBukuField.clear();
   	   } catch (SQLException e) {
   		   e.printStackTrace();
   	   }
    }
    
    @FXML
    private void editBuku() {
    	Buku selectedBuku = bukuTable.getSelectionModel().getSelectedItem();
    	if (selectedBuku == null) {
    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	    alert.setTitle("Error");
    	    alert.setHeaderText(null);
    	    alert.setContentText("Pilih buku yang ingin diupdate.");
    	    alert.showAndWait();
    	    return;
    	}
    	try (Connection conn = DatabaseConnector.getConnection();
   	         PreparedStatement stmt = conn.prepareStatement("UPDATE buku SET judul = ?, penulis = ?, harga = ?, stok = ? WHERE judul = ?")) {
    		stmt.setString(1, judulBukuField.getText());
   	        stmt.setString(2, penulisBukuField.getText());
   	        stmt.setInt(3, Integer.parseInt(hargaBukuField.getText()));
   	        stmt.setInt(4, Integer.parseInt(stokBukuField.getText()));
   	        stmt.setString(5, selectedBuku.getJudul());
   	        stmt.executeUpdate();
   	        loadDataFromDatabase();
   	        judulBukuField.clear();
	        penulisBukuField.clear();
	        hargaBukuField.clear();
	        stokBukuField.clear();
   	    } catch (SQLException e) {
   	        e.printStackTrace();
   	    }
    }
    
    @FXML
    private void deleteBuku() {
    	Buku selectedBuku = bukuTable.getSelectionModel().getSelectedItem();
    	if (selectedBuku == null) {
    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	    alert.setTitle("Error");
    	    alert.setHeaderText(null);
    	    alert.setContentText("Pilih buku yang ingin dihapus.");
    	    alert.showAndWait();
    	    return;
    	}
    	try (Connection conn = DatabaseConnector.getConnection();
    		PreparedStatement stmt = conn.prepareStatement("DELETE FROM buku WHERE judul = ?")) {
    		stmt.setString(1, selectedBuku.getJudul());
            stmt.executeUpdate();
   	        loadDataFromDatabase();
   	    } catch (SQLException e) {
   	        e.printStackTrace();
   	    }
    }
    
    @FXML
    private void addPenjualan() {
        int jumlah = Integer.parseInt(jumlahPenjualanField.getText());
        try (Connection conn = DatabaseConnector.getConnection()) {
            String selectQuery = "SELECT harga FROM buku WHERE buku_id = ?";
            try (PreparedStatement selectStmt = conn.prepareStatement(selectQuery)) {
                selectStmt.setInt(1, Integer.parseInt(IDBukuField.getText()));
                ResultSet rs = selectStmt.executeQuery();
                if (!rs.next()) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("ID buku yang dimasukkan tidak ditemukan.");
                    alert.showAndWait();
                    return;
                }
                int hargaBuku = rs.getInt("harga");
                int totalHarga = jumlah * hargaBuku;
                String insertQuery = "INSERT INTO penjualan (jumlah, total_harga, tanggal, pelanggan_id, buku_id) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
                    insertStmt.setInt(1, jumlah);
                    insertStmt.setInt(2, totalHarga);
                    insertStmt.setString(3, tanggalPenjualanField.getText());
                    insertStmt.setInt(4, Integer.parseInt(IDPelangganField.getText()));
                    insertStmt.setInt(5, Integer.parseInt(IDBukuField.getText()));
                    insertStmt.executeUpdate();
                    loadDataFromDatabase();
                    jumlahPenjualanField.clear();
                    tanggalPenjualanField.clear();
                    IDBukuField.clear();
                    IDPelangganField.clear();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void editPenjualan() {
    	Penjualan selectedPenjualan = penjualanTable.getSelectionModel().getSelectedItem();
	    if (selectedPenjualan == null) {
	    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Pilih penjualan yang ingin diedit.");
            alert.showAndWait();
	        return;
	    }
	    int jumlah = Integer.parseInt(jumlahPenjualanField.getText());
        try (Connection conn = DatabaseConnector.getConnection()) {
            String selectQuery = "SELECT harga FROM buku WHERE buku_id = ?";
            try (PreparedStatement selectStmt = conn.prepareStatement(selectQuery)) {
                selectStmt.setInt(1, Integer.parseInt(IDBukuField.getText()));
                ResultSet rs = selectStmt.executeQuery();
                if (!rs.next()) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("ID buku yang dimasukkan tidak ditemukan.");
                    alert.showAndWait();
                    return;
                }
                int hargaBuku = rs.getInt("harga");
                int totalHarga = jumlah * hargaBuku;
                String updateQuery = "UPDATE penjualan SET jumlah = ?, total_harga = ?, tanggal = ?, pelanggan_id = ?, buku_id = ? WHERE tanggal = ?";
                try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                    updateStmt.setInt(1, jumlah);
                    updateStmt.setInt(2, totalHarga);
                    updateStmt.setString(3, tanggalPenjualanField.getText());
                    updateStmt.setInt(4, Integer.parseInt(IDPelangganField.getText()));
                    updateStmt.setInt(5, Integer.parseInt(IDBukuField.getText()));
                    updateStmt.setString(6, selectedPenjualan.getTanggal());
                    updateStmt.executeUpdate();
                    loadDataFromDatabase();
                    jumlahPenjualanField.clear();
                    tanggalPenjualanField.clear();
                    IDBukuField.clear();
                    IDPelangganField.clear();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void deletePenjualan() {
    	Penjualan selectedPenjualan = penjualanTable.getSelectionModel().getSelectedItem();
    	if (selectedPenjualan == null) {
    		Alert alert = new Alert(Alert.AlertType.INFORMATION);
    	    alert.setTitle("Error");
    	    alert.setHeaderText(null);
    	    alert.setContentText("Pilih penjualan yang ingin dihapus.");
    	    alert.showAndWait();
    	    return;
    	}
    	try (Connection conn = DatabaseConnector.getConnection();
    		PreparedStatement stmt = conn.prepareStatement("DELETE FROM penjualan WHERE tanggal = ?")) {
    		stmt.setString(1, selectedPenjualan.getTanggal());
            stmt.executeUpdate();
   	        loadDataFromDatabase();
   	    } catch (SQLException e) {
   	        e.printStackTrace();
   	    }
    }
}
    	
    	