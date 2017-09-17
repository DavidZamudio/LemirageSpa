
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

        private String username = "root";
        private String password = "";
        private String hostname = "localhost";
        private String port = "3306";
        private String database = "lemiragespa";
        private String classname = "com.mysql.jdbc.Driver";
        private String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
        private Connection conn;
        
        public Conexion() {
        
            try {
                Class.forName(classname);
                conn = DriverManager.getConnection(url, url, password);
            } catch (Exception e)  {
                System.err.println(e.getMessage());
            }
            
        }
        
        public Connection getConnection() {
            return this.conn;
        
        }
        


}
