package vjezba.rpr.etf.unsa.ba.lv7;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private ListView<String> userListView;

    @FXML
    private TextField imeTextField;

    @FXML
    private TextField prezimeTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField korisnickoImeTextField;

    @FXML
    private PasswordField lozinkaPasswordField;

    @FXML
    private void initialize() {
        // Inicijalizacija forme
        // Postavite potrebne događaje ili podatke ako je potrebno
    }

    @FXML
    private void dodajKorisnika() {
        String ime = imeTextField.getText();
        String prezime = prezimeTextField.getText();
        // You can similarly get data from other fields (email, korisnickoIme, lozinka)

        // Create a new user with the provided data
        String newUser = ime + " " + prezime;

        // Add the new user to the ListView
        userListView.getItems().add(newUser);

        // Clear text fields for the next user
        imeTextField.clear();
        prezimeTextField.clear();
        emailTextField.clear();
        korisnickoImeTextField.clear();
        lozinkaPasswordField.clear();
    }

    @FXML
    private void zavrsiProgram() {
        Platform.exit();
    }
}