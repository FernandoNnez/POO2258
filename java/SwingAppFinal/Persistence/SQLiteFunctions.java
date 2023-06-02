package SwingAppFinal.Persistence;
import SwingAppFinal.Model.Mod;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class SQLiteFunctions implements InterfaceFunctions {
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
    public boolean delete(int id) throws SQLException {
        String sqlDelete="DELETE FROM MainTable WHERE id=?;";
        int rowCount=0;
        PreparedStatement ptsm= ConnectionSingleton.getInstance("mainDB.db").getConnection().prepareStatement(sqlDelete);
        ptsm.setInt(1,id);
        rowCount=ptsm.executeUpdate();
        return rowCount>0;
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