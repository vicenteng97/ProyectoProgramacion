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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Vicente
 */
public class MenuUsuariosController implements Initializable {

    @FXML
    private Button buttonProveedores;
    @FXML
    private Button buttonAverias;
    @FXML
    private Button buttonClientes;
    @FXML
    private Button buttonPiezas;
    @FXML
    private Button buttonEmpleados;
    @FXML
    private Button buttonMotocicletas;
    @FXML
    private MenuItem ventanaAyuda;

    /**
     * Initializes the controller class.
     */
    
    public void button(){
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickMotocicletas(MouseEvent event) {
        
        
    }

    @FXML
    private void dialogoAyuda(ActionEvent event) {
        
        Alert alert=new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Ayuda");
        alert.setHeaderText("Ayuda e instrucciones");
        alert.setContentText("Para continuar con la aplicacion debes elegir una opcion"
                + "de las solicitadas, dentro de ellas encontrarás mas ayudas." + "\n");
        Optional<ButtonType>result=alert.showAndWait();
        if(result.isPresent()&&result.get()==ButtonType.OK){
            System.out.println("OK");
        }
        
    }
    
}
