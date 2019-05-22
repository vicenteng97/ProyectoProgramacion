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
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
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
    
    public static void llenarAverias(ObservableList <Empleados> lista) throws SQLException{
        Conexion conexion=new Conexion();
        Connection con=conexion.conectar();
        ResultSet rs;
        PreparedStatement stmt=null;
        try{
            stmt=con.prepareStatement("SELECT * FROM Averia");
            stmt.executeQuery();
            rs = stmt.executeQuery();
            
            while(rs.next()){
                ObservableList<Empleados> add = lista.add(new Empleados(
                        rs.getInt("Dni"),
                        rs.getString("Nombre"),
                        rs.getString("Apellidos"),
                        rs.getInt("Telefono"),
                        rs.getString("FechaNac"),
                        rs.getString("Especialidad"),
                ));
            }
            
        }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
