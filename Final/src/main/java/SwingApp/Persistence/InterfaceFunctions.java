package SwingApp.Persistence;
import java.sql.SQLException;
import java.util.ArrayList;
public interface InterfaceFunctions {
    public abstract boolean insert(Object obj)throws SQLException;
    public abstract boolean update(Object obj)throws SQLException;
    public abstract boolean delete(String id)throws SQLException;
    public abstract ArrayList getAll()throws SQLException;
}