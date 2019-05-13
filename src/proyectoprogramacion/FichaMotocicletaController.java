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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DAW
 */
public class FichaMotocicletaController implements Initializable {

    @FXML
    private TextField tfKilometros;
    @FXML
    private TextField tfCilindrada;
    @FXML
    private TextField tfTipo;
    @FXML
    private TextField tfPotencia;
    @FXML
    private TextField tfMatricula;
    @FXML
    private TextField tfColor;
    @FXML
    private TextField tfPrecio;
    @FXML
    private TextField tfExtras;
    @FXML
    private TextField tfId;
    @FXML
    private ComboBox<?> cbA2;
    @FXML
    private TextField tfModelo;
    @FXML
    private TextField tfMarca;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
