import java.sql.Connection;
import utils.Fachada;


public class Conexion {

    Connection conn = null; 

    public Connection get_connection(){
    
    
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
 
    
    public void close_connection(){
        
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }    
}
