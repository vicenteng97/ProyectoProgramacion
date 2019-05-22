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
    
     public static void llenarPieza(ObservableList <Pieza> lista) throws SQLException{
        Conexion conexion=new Conexion();
        Connection con=conexion.conectar();
        ResultSet rs;
        PreparedStatement stmt=null;
        try{
            stmt=con.prepareStatement("SELECT * FROM Pieza");
            stmt.executeQuery();
            rs = stmt.executeQuery();
            
            while(rs.next()){
                lista.add(new Pieza(
                       // rs.getInt("Dni"),
                       // rs.getString("Nombre"),
                       // rs.getString("Apellidos"),
                       // rs.getInt("Telefono"),
                        //rs.getString("FechaNac"), 
                       // rs.getInt("IdMotocicleta")
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
