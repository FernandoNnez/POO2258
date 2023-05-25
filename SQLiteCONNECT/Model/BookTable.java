package SQLiteCONNECT.Model;
import SQLiteCONNECT.Persistence.BookDAO;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;
public class BookTable implements TableModel {
    public static final int COLUMNS=3;
    private ArrayList<Book>data;
    private BookDAO Bdao;
    public BookTable() {
        Bdao=new BookDAO();
        data=new ArrayList<>();
    }
    public BookTable(ArrayList<Book> data) {
        this.data = data;
        Bdao=new BookDAO();
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
                return "Id";
            case 1:
                return "Title";
            case 2:
                return "Author";
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
        }
        return null;
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book tmp=data.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getTitle();
            case 2:
                return tmp.getAuthor();
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
                data.get(rowIndex).setTitle((String)aValue);
                break;
            case 2:
                data.get(rowIndex).setAuthor((String)aValue);
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
            data=Bdao.getAll();
        }catch (SQLException error){
            System.out.println("error on getting data");
        }
    }
    public boolean addBook(Book book){
        boolean result=false;
        try {
            if(Bdao.insert(book)){
                data.add(book);
                result=true;
            }else{
                result=false;
            }
        }catch (SQLException error){
            error.printStackTrace();
            System.out.println(error.getMessage());
        }
        return result;
    }
}