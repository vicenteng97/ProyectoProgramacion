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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DAW
 */
public class FichaAveriaController implements Initializable {

    @FXML
    private TextField tfId;
    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfEmpleado;
    @FXML
    private TextField tfPiezas;
    @FXML
    private TextField tfPrecio;
    @FXML
    private DatePicker dpFecha;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
