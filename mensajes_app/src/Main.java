
import java.sql.Connection;


import utils.Fachada;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Connection conn = null;  
        try{
            conn = Fachada.getConnection();
            if (conn != null){
                System.out.println("Conexion exitosa a la base de datos");
            }
        }catch(Exception e){
            System.out.println(e);
        }


    }
}

