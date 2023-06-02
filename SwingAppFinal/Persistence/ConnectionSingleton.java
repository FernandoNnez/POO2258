package SwingAppFinal.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionSingleton {
    private String dataBase;
    public static ConnectionSingleton _instance;
    private Connection connection;
    private ConnectionSingleton(String dB) {
        this.dataBase = dB;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:"+this.dataBase);
        } catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ConnectionSingleton getInstance(String baseDatos) {
        if(_instance == null){
            _instance = new ConnectionSingleton(baseDatos);
        }
        return _instance;
    }
    public Connection getConnection() {
        return connection;
    }
}