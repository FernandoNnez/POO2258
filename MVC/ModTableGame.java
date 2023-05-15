package MVC;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
public class ModTableGame implements TableModel {
    public static final int COLUMNS=6;
    ArrayList<VideoGame>data;
    public ModTableGame(ArrayList<VideoGame>data){
        this.data=data;
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
    public String getColumnName(int columnIndex) {
        String columnName="";
        switch (columnIndex){
            case 0:
                columnName="Id.";
                break;
            case 1:
                columnName="Name.";
                break;
            case 2:
                columnName="Gender.";
                break;
            case 3:
                columnName="Size GB.";
                break;
            case 4:
                columnName="Plataform.";
                break;
            case 5:
                columnName="Dev.";
                break;
        }
        return columnName;
    }
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
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
        VideoGame tpm=data.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tpm.getId();
            case 1:
                return tpm.getName();
            case 2:
                return tpm.getGender();
            case 3:
                return tpm.getSizeGB();
            case 4:
                return tpm.getPlataform();
            case 5:
                return tpm.getDev();
        }
        return null;
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }
    @Override
    public void addTableModelListener(TableModelListener l) {
    }
    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    public void addGame(VideoGame game){
        this.data.add(game);
    }
}
