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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author DAW
 */
public class FichaProveedoresController implements Initializable {

    @FXML
    private TextField tfId;
    @FXML
    private TextField tfNombre;
    @FXML
    private TableView<?> tvProveedores;
    @FXML
    private TableColumn<Proveedor, id> tcId;
    @FXML
    private TableColumn<Proveedor, nombre> tcNombre;

    /**
     * Initializes the controller class.
     */
    
     public static void llenarProveedor(ObservableList <Proveedor> lista) throws SQLException{
        Conexion conexion=new Conexion();
        Connection con=conexion.conectar();
        ResultSet rs;
        PreparedStatement stmt=null;
        try{
            stmt=con.prepareStatement("SELECT * FROM Proveedor");
            stmt.executeQuery();
            rs = stmt.executeQuery();
            
            while(rs.next()){
                lista.add(new Proveedor(
                        rs.getInt("Id"),
                        rs.getString("Nombre"),      
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
