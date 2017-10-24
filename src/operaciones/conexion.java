/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operaciones;

import java.sql.*;

/**
 *
 * @author risky
 */
public class conexion {
    
    private Connection conn=null;
    
    public String bd = "ejemplo1";
    public String login = "programacion";
    public String password = "123456";
    public String url = "jdbc:mysql://localhost/" + bd;
    
    
    public Connection creaConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            
            if (conn != null) {
                //System.out.println("Conexión a base de datos " + url + " ... Ok");
                System.out.println("Conexión a base de datos  ... Ok");
            }
        }
        catch(ClassNotFoundException | SQLException ex){
             System.out.println(ex);
        }
        return conn;
    }
    
    public void cerrarConexion(Connection con){
        try{
            con.close();
            System.out.println("Cerrando conexión a base de datos  ... Ok");
        }catch(SQLException e){
             System.out.println(e);
    }
    }
    
}
