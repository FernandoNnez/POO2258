package SQLiteCONNECT.Persistence;
import SQLiteCONNECT.Model.Book;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class BookDAO implements InterfaceDAO {
    public BookDAO() {
    }
    @Override
    public boolean insert(Object obj) throws SQLException {
        String sqlInsert="INSERT INTO libros(titulo, autor) VALUES(?,?);";
        int rowCount=0;
        PreparedStatement ptsm= ConnectionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlInsert);
        ptsm.setString(1,((Book)obj).getTitle());
        ptsm.setString(2,((Book)obj).getAuthor());
        rowCount=ptsm.executeUpdate();
        return rowCount>0;
    }
    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate="UPDATE libros SET titulo=?, autor=? WHERE id=?;";
        int rowCount=0;
        PreparedStatement ptsm= ConnectionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlUpdate);
        ptsm.setString(1,((Book)obj).getTitle());
        ptsm.setString(2,((Book)obj).getAuthor());
        ptsm.setInt(3,((Book)obj).getId());
        rowCount=ptsm.executeUpdate();
        return rowCount>0;
    }
    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete="DELETE FROM libros WHERE id=?;";
        int rowCount=0;
        PreparedStatement ptsm= ConnectionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlDelete);
        ptsm.setInt(1,Integer.parseInt(id));
        rowCount=ptsm.executeUpdate();
        return rowCount>0;
    }
    @Override
    public ArrayList getAll() throws SQLException {
        String sql="SELECT * FROM libros";
        ArrayList<Book>result=new ArrayList<>();
        PreparedStatement stm= ConnectionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sql);
        ResultSet rst=stm.executeQuery();
        while(rst.next()){
            result.add(new Book(rst.getInt(1),rst.getString(2),rst.getString(3)));
        }
        return result;
    }
    @Override
    public Object searchID(String id) throws SQLException {
        String sql="SELECT * FROM libros WHERE id=?;";
        Book book=null;
        PreparedStatement ptsm= ConnectionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sql);
        ptsm.setInt(1,Integer.parseInt(id));
        ResultSet rst=ptsm.executeQuery();
        if(rst.next()){
            book=new Book(rst.getInt(1),rst.getString(2),rst.getString(3));
            return book;
        }
        return null;
    }
}