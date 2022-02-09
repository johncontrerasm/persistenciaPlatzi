import java.sql.Connection;
import utils.Fachada;


public class Conexion {

    public Connection get_connection(){
    Connection conn = null; 
    
            try{
                conn = Fachada.getConnection();
                if (conn != null){
                    System.out.println("Conexion exitosa a la base de datos");
                }
            }catch(Exception e){
                System.out.println(e);
            }

            return conn;
    }
    
}
