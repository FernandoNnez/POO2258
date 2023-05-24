package SQLiteCONNECT.Persistence;
import java.sql.SQLException;
import java.util.ArrayList;
public interface InterfaceDAO {
    public abstract boolean insert(Object obj)throws SQLException;
    public abstract boolean update(Object obj)throws SQLException;
    public abstract boolean delete(String id)throws SQLException;
    public abstract ArrayList getAll()throws SQLException;
    public abstract Object searchID(String id)throws SQLException;
}