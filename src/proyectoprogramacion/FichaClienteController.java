/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

import DAO.Conexion;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
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
    @FXML
    private TableColumn<Cliente, DNI> tcDNI;
    @FXML
    private TableColumn<Cliente, Nombre> tcNombre;
    @FXML
    private TableColumn<Cliente, Apellidos> tcApellidos;
    @FXML
    private TableColumn<Cliente, Telefono> tcTelefono;
    @FXML
    private TableColumn<Cliente, FechaNac> tcFechaNac;
    @FXML
    private TableColumn<Cliente, IdMoto> tcIdMoto;
    @FXML
    private Button buttonAñadir;

    /**
     * Initializes the controller class.
     */
    
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
    
     public static void llenarEmpleados(ObservableList <Empleados> lista) throws SQLException{
        Conexion conexion=new Conexion();
        Connection con=conexion.conectar();
        ResultSet rs;
        PreparedStatement stmt=null;
        try{
            stmt=con.prepareStatement("SELECT * FROM Empleados");
            stmt.executeQuery();
            rs = stmt.executeQuery();
            
            while(rs.next()){
                lista.add(new Empleados(
                        rs.getInt("Dni"),
                        rs.getString("Nombre"),
                        rs.getString("Apellidos"),
                        rs.getInt("Telefono"),
                        rs.getString("FechaNac"), 
                        rs.getInt("IdMotocicleta")
                ));
            }
            
        }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
    }
    
    @Override
   public void initialize(URL url, ResourceBundle rb) {     
    }    

    
        
    }
    

