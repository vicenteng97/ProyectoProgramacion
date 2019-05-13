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
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Vicente
 */
public class LoginProyectoController implements Initializable {

    @FXML
    private Button botonLogin;
    @FXML
    private TextField idUsuario;
    @FXML
    private TextField passUsuario;

    /**
     * Initializes the controller class.
     */
    
    public void login(){
        String user = idUsuario.getText();
        String password = passUsuario.getText(); 
        Conexion conexion = new Conexion();
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        con = conexion.conectar();
        
        boolean autenticado = false;
        
        try{
            stmt = con.prepareStatement("SELECT User, Password FROM Empleados E "
                    + "WHERE E.User=? AND E.Password=?");
            
            stmt.setString(1, user);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if(rs.next()){
                autenticado = true;
                try{
                        //REALIZAR MENÚ
                        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource(""));
                        Parent root= (Parent)fxmlLoader.load();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.initModality(Modality.APPLICATION_MODAL);
                        stage.show();

                    } catch (Exception ex){
                        ex.getMessage();
                        }
            }
        }catch(Exception ex){
            ex.getMessage();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
    }    
    
}
