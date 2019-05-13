/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DAW
 */
public class FichaClienteController implements Initializable {

    @FXML
    private TextField tfDNI;
    @FXML
    private TextField tfTelefono;
    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfApellidos;
    @FXML
    private TextField tfIdMoto;
    @FXML
    private DatePicker dpFechaNacimiento;
    @FXML
    private TableView<?> tvClientes;

    /**
     * Initializes the controller class.
     */
    
    
    
    
    @Override
   public void initialize(URL url, ResourceBundle rb) {
        
        
        
    }    

    @FXML
    private void dialogoAyuda(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Ayuda");
        alert.setHeaderText("Ayuda e instrucciones");
        alert.setContentText("");
        Optional<ButtonType>result=alert.showAndWait();
        if(result.isPresent()&&result.get()==ButtonType.OK){
            System.out.println("OK");
        }
        
    }
    
}
