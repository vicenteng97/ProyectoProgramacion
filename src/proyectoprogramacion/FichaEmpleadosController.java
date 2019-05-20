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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DAW
 */
public class FichaEmpleadosController implements Initializable {

    @FXML
    private DatePicker dpFechaNacimiento;
    @FXML
    private TextField tfDNI;
    @FXML
    private TextField tfTelefono;
    @FXML
    private TextField tfEspecialidad;
    @FXML
    private TextField tfApellidos;
    @FXML
    private TextField tfNombre;
    @FXML
    private TableView<Empleados> tvEmpleados;
    @FXML
    private TableColumn<Empleados, dni> tcDNI;
    @FXML
    private TableColumn<Empleados, nombre> tcNombre;
    @FXML
    private TableColumn<Empleados, apellidos> tcApellidos;
    @FXML
    private TableColumn<Empleados, telefono> tcTelefono;
    @FXML
    private TableColumn<Empleados, fechaNac> tcFechaNac;
    @FXML
    private TableColumn<Empleados, especialidad> tcEspecialidad;
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
