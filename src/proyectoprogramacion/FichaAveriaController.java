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
    @FXML
    private TableView<?> tablaAverias;
    @FXML
    private TableColumn<Averia, Id> tcId;
    @FXML
    private TableColumn<Averia, Nombre> tcNombre;
    @FXML
    private TableColumn<Averia, Fecha> tcFecha;
    @FXML
    private TableColumn<Averia, Empleado> tcEmpleado;
    @FXML
    private TableColumn<Averia, Piezas> tcPiezas;
    @FXML
    private TableColumn<Averia, Precio> tcPrecio;
    @FXML
    private Button buttonAñadir;

    /**
     * Initializes the controller class.
     */
    
    public static void llenarAverias(ObservableList <Averias> lista) throws SQLException{
        Conexion conexion=new Conexion();
        Connection con=conexion.conectar();
        ResultSet rs;
        PreparedStatement stmt=null;
        try{
            stmt=con.prepareStatement("SELECT * FROM Averia");
            stmt.executeQuery();
            rs = stmt.executeQuery();
            
            while(rs.next()){
                lista.add(new Averia(
                        rs.getInt("Id"),
                        rs.getString("Nombre"),
                        rs.getString("Fecha"),
                        rs.getInt("Empleado"),
                        rs.getString("Piezas"),
                        rs.getInt("PrecioTotal"),
                        
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
