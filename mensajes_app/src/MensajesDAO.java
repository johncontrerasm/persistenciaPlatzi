import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {


    public static void crearMensajeDB(Mensajes mensaje){
        Conexion db_connexion = new Conexion();

        try(Connection conexion = db_connexion.get_connection()){
        
            PreparedStatement ps = null;
            try{
                 String query="INSERT INTO mensajes (mensaje,autor_mensaje) VALUES (?,?);";   
                 ps = conexion.prepareStatement(query);
                 ps.setString(1, mensaje.getMensaje());
                 ps.setString(2, mensaje.getAutor_mensaje());
                 ps.executeUpdate();
                 System.out.println("Mensaje creado");
            }catch(SQLException ex){
                System.out.println(ex);
            }
        }catch(SQLException e){
            System.out.println(e);
        }

    }



    
    public static void leerMensajesDB(){
        Conexion db_connexion = new Conexion();
        try(Connection conexion = db_connexion.get_connection()){


        }catch(SQLException e){
            System.out.println(e);
        }

    }

    public static void borrarMensajesDB(int id_mensaje){

    }

    public static void actualizarMensajesDB(Mensajes mensaje){

    }


    
}
