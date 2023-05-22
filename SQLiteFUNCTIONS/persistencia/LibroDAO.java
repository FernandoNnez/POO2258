package SQLiteFUNCTIONS.persistencia;
import SQLiteFUNCTIONS.Modelo.Libro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LibroDAO implements InterfazDAO {
    public LibroDAO() {
    }
    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert="INSERT INTO libros(titulo, autor) VALUES(?,?);";
        int rowCount=0;
        PreparedStatement ptsm= ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlInsert);
        ptsm.setString(1,((Libro)obj).getTitulo());
        ptsm.setString(2,((Libro)obj).getAutor());
        rowCount=ptsm.executeUpdate();
        return rowCount>0;
    }
    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate="UPDATE libros SET titulo=?, autor=? WHERE id=?;";
        int rowCount=0;
        PreparedStatement ptsm=ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlUpdate);
        ptsm.setString(1,((Libro)obj).getTitulo());
        ptsm.setString(2,((Libro)obj).getAutor());
        ptsm.setInt(3,((Libro)obj).getId());
        rowCount=ptsm.executeUpdate();
        return rowCount>0;
    }
    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete="DELETE FROM libros WHERE id=?;";
        int rowCount=0;
        PreparedStatement ptsm=ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlDelete);
        ptsm.setInt(1,Integer.parseInt(id));
        rowCount=ptsm.executeUpdate();
        return rowCount>0;
    }
    @Override
    public ArrayList getAll() throws SQLException {
        String sql="SELECT * FROM libros";
        ArrayList<Libro>resultado=new ArrayList<>();
            PreparedStatement stm=ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sql);
            ResultSet rst=stm.executeQuery();
            while(rst.next()){
                resultado.add(new Libro(rst.getInt(1),rst.getString(2),rst.getString(3)));
            }
        return resultado;
    }
    @Override
    public Object searchID(String id) throws SQLException {
        String sql="SELECT * FROM libros WHERE id=?;";
        Libro libro=null;
        PreparedStatement ptsm=ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sql);
        ptsm.setInt(1,Integer.parseInt(id));
        ResultSet rst=ptsm.executeQuery();
        if(rst.next()){
            libro=new Libro(rst.getInt(1),rst.getString(2),rst.getString(3));
            return libro;
        }
        return null;
    }
}