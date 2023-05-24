package SQLiteCONNECT.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionSingleton {
    private String baseDatos;
    public static ConnectionSingleton _instance;
    private Connection connection;
    private ConnectionSingleton(String database) {
        this.baseDatos = database;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:"+this.baseDatos);
        } catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ConnectionSingleton getInstance(String baseDatos) {
        if(_instance == null){
            _instance = new ConnectionSingleton(baseDatos);
        }else{
            System.out.println("Ya fué creada.");
        }
        return _instance;
    }
    public Connection getConnection() {
        return connection;
    }
}