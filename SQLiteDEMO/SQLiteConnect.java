package SQLiteDEMO;
import java.sql.*;

import org.sqlite.JDBC;
//CAMBIAR LA BASE DE DATOS POR LA QUE ESTES UTILIZANDO EN EL EXPLORER DEL IDLE!!!
//⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️
public class SQLiteConnect {
    public static void main(String[] args) {
        String DB_URL="jdbc:sqlite:librosDB.db";
        Connection connection=null;

        try {
            Class.forName("org.sqlite.JDBC");
            connection= DriverManager.getConnection(DB_URL);
            Statement stm=connection.createStatement();
            ResultSet rst=stm.executeQuery("SELECT * FROM libros;");
            while (rst.next()){
                System.out.println(rst.getString(1)+rst.getString(2));
            }
            connection.close();
        }catch (ClassNotFoundException cne){
            cne.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
