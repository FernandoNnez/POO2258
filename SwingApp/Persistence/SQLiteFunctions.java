package SwingApp.Persistence;
import SwingApp.Model.Mod;
import SwingApp.Utilites.Comunication;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;
public class SQLiteFunctions implements InterfaceFunctions {
    Comunication comunication=new Comunication();
    public SQLiteFunctions() {
    }
    @Override
    public boolean insert(Object obj) throws SQLException {
        String sqlInsert="INSERT INTO MainTable(Name, Hostile, Gender, LivingPlace, URL) VALUES(?,?,?,?,?);";
        int rowCount=0;
        PreparedStatement ptsm= ConnectionSingleton.getInstance("mainDB.db").getConnection().prepareStatement(sqlInsert);
        ptsm.setString(1,((Mod)obj).getName());
        ptsm.setString(2,((Mod)obj).getHostile());
        ptsm.setString(3,((Mod)obj).getGender());
        ptsm.setString(4,((Mod)obj).getLivingPlace());
        ptsm.setString(5,((Mod)obj).getURL());
        rowCount=ptsm.executeUpdate();
        return rowCount>0;
    }
    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate="UPDATE MainTable SET Name=?, Hostile=?, Gender=?, LivingPlace=?, URL=? WHERE ID=?;";
        int rowCount=0;
        PreparedStatement ptsm= ConnectionSingleton.getInstance("mainDB.db").getConnection().prepareStatement(sqlUpdate);
        ptsm.setString(1,((Mod)obj).getName());
        ptsm.setString(2,((Mod)obj).getHostile());
        ptsm.setString(3,((Mod)obj).getGender());
        ptsm.setString(4,((Mod)obj).getLivingPlace());
        ptsm.setString(5,((Mod)obj).getURL());
        ptsm.setInt(6,((Mod)obj).getID());
        rowCount=ptsm.executeUpdate();
        return rowCount>0;
    }
    @Override
    public boolean delete(String id) throws SQLException {
        if (Pattern.matches("\\d+", id)) {
            int numericId = Integer.parseInt(id);
            String sqlDelete="DELETE FROM MainTable WHERE id=?;";
            int rowCount=0;
            PreparedStatement ptsm= ConnectionSingleton.getInstance("mainDB.db").getConnection().prepareStatement(sqlDelete);
            ptsm.setInt(1,Integer.parseInt(id));
            rowCount=ptsm.executeUpdate();
            return rowCount>0;
        } else {
            comunication.Msgs("Type only numbers","Error");
        }
        return false;
    }
    @Override
    public ArrayList getAll() throws SQLException {
        String sql="SELECT * FROM MainTable";
        ArrayList<Mod>result=new ArrayList<>();
        PreparedStatement stm= ConnectionSingleton.getInstance("mainDB.db").getConnection().prepareStatement(sql);
        ResultSet rst=stm.executeQuery();
        while(rst.next()){
            result.add(new Mod(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));
        }
        return result;
    }
}