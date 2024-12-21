package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class DatabaseMahasiswaController {
	@FXML
	private TableView<Mahasiswa> tabelMahasiswa;
	@FXML
	private TableColumn<Mahasiswa, String> kolomNim;
	@FXML
	private TableColumn<Mahasiswa, String> kolomNama;
	
	@FXML
	public void inisialisasi() {
		ObservableList<Mahasiswa> listMahasiswa = FXCollections.observableArrayList(
			new Mahasiswa(1, "John", "110"),
			new Mahasiswa(2, "Jane", "120"),
			new Mahasiswa(3, "Jono", "130110"),
			new Mahasiswa(4, "Agus", "140"),
			new Mahasiswa(5, "James", "150130"),
			new Mahasiswa(6, "Jones", "160120"),
			new Mahasiswa(7, "Jimmy", "170150"),
			new Mahasiswa(8, "Jamy", "18060"),
			new Mahasiswa(9, "Vardy", "190"),
			new Mahasiswa(10, "Jessica", "200180")	
		);
	
		kolomNim.setCellValueFactory(new PropertyValueFactory<>("nim"));
		kolomNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
		
		tabelMahasiswa.setItems(listMahasiswa);
	}
}