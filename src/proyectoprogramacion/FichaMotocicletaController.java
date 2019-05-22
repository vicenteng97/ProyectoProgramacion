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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    @FXML
    private TableView<?> tvMotocicleta;
    @FXML
    private TableColumn<Motocicletas, ?> tcId;
    @FXML
    private TableColumn<Motocicletas, ?> tcMarca;
    @FXML
    private TableColumn<Motocicletas, ?> tcModelo;
    @FXML
    private TableColumn<Motocicletas, ?> tcMatricula;
    @FXML
    private TableColumn<Motocicletas, ?> tcTipo;
    @FXML
    private TableColumn<Motocicletas, ?> tcCilindrada;
    @FXML
    private TableColumn<Motocicletas, ?> tcPotencia;
    @FXML
    private TableColumn<Motocicletas, ?> tcA2;
    @FXML
    private TableColumn<Motocicletas, ?> tcKilometros;
    @FXML
    private TableColumn<Motocicletas, ?> tcColor;
    @FXML
    private TableColumn<Motocicletas, ?> tcPrecio;
    @FXML
    private TableColumn<Motocicletas, ?> tcExtras;

    /**
     * Initializes the controller class.
     */
    
         public static void llenarMotocicletas(ObservableList <Motocicletas> lista) throws SQLException{
        Conexion conexion=new Conexion();
        Connection con=conexion.conectar();
        ResultSet rs;
        PreparedStatement stmt=null;
        try{
            stmt=con.prepareStatement("SELECT * FROM Motocicletas");
            stmt.executeQuery();
            rs = stmt.executeQuery();
            
            while(rs.next()){
                lista.add(new Motocicleta(
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
