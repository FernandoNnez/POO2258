package SwingAppFinal.Model;
import SwingAppFinal.Persistence.SQLiteFunctions;
import SwingAppFinal.Utilites.Comunication;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;
public class ModTable implements TableModel {
    Comunication comunication=new Comunication();
    public static final int COLUMNS=6;
    private ArrayList<Mod>data;
    private SQLiteFunctions SqlF;
    public ModTable() {
        SqlF=new SQLiteFunctions();
        data=new ArrayList<>();
    }
    public ModTable(ArrayList<Mod> data) {
        this.data = data;
        SqlF=new SQLiteFunctions();
    }
    @Override
    public int getRowCount() {
        return data.size();
    }
    @Override
    public int getColumnCount() {
        return COLUMNS;
    }
    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "ID";
            case 1:
                return "Name";
            case 2:
                return "Hostile";
            case 3:
                return "Gender";
            case 4:
                return "LivingPlace";
            case 5:
                return "URL";
        }
        return null;
    }
    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;

        }
        return null;
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mod tmp=data.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getID();
            case 1:
                return tmp.getName();
            case 2:
                return tmp.getHostile();
            case 3:
                return tmp.getGender();
            case 4:
                return tmp.getLivingPlace();
            case 5:
                return tmp.getURL();
        }
        return null;
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        switch (columnIndex){
            case 0:
                //data.get(rowIndex).getId(0);
                break;
            case 1:
                data.get(rowIndex).setName((String)aValue);
                break;
            case 2:
                data.get(rowIndex).setHostile((String)aValue);
                break;
            case 3:
                data.get(rowIndex).setGender((String)aValue);
                break;
            case 4:
                data.get(rowIndex).setLivingPlace((String)aValue);
                break;
            case 5:
                data.get(rowIndex).setURL((String)aValue);
                break;
            default:
                System.out.println("nothing changed");
        }
    }
    @Override
    public void addTableModelListener(TableModelListener l) {
    }
    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    public void loadData(){
        try {
            data=SqlF.getAll();
        }catch (SQLException error){
            error.printStackTrace();
            comunication.Msgs("Error getting data","Error");
        }
    }
    public boolean addItem(Mod mod){
        boolean result=false;
        try{
            if(SqlF.insert(mod)){
                data.add(mod);
                result=true;
            }else{
                result=false;
            }
        }catch(SQLException error){
            comunication.Msgs("Can not add from DB, check connection to DB for add an item or contact to support for more details","Error");
        }
        return result;
    }
    public boolean updateItem(Mod mod){
        boolean result=false;
        try{
            if(SqlF.update(mod)){
                result=true;
            }else{
                result=false;
            }
        }catch(SQLException error){
            comunication.Msgs("Can not update from DB, check connection to DB for update an item or contact to support for more details","Error");
        }
        return result;
    }
    public boolean deleteItem(int ID){
        boolean result=false;
        try {
            if(SqlF.delete(ID)){
                result=true;
            }else{
                result=false;
            }
        }catch(SQLException e){
            comunication.Msgs("Can not delete from DB, check connection to DB for delete an item or contact to support for more details","Error");
        }
        return result;
    }
}