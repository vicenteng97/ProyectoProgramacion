/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DAW
 */
public class FichaPiezaController implements Initializable {

    @FXML
    private TextField tfId;
    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfProveedor;
    @FXML
    private TextField tfPrecio;
    @FXML
    private TableView<?> tvPieza;
    @FXML
    private TableColumn<?, ?> tcId;
    @FXML
    private TableColumn<?, ?> tcNombre;
    @FXML
    private TableColumn<?, ?> tcProveedor;
    @FXML
    private TableColumn<?, ?> tcPrecio;
    @FXML
    private Button buttonAñadir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
