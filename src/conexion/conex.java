package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
public class conex {
   Connection cn;
   public Connection ConectarBD(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/logindelproyecto","root","");
           System.out.println("Conexion exitosa");
       } catch (Exception e) {
           System.out.println("Conexion fallida"+e);
       }
       
       return cn;
   }
}
