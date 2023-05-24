package SQLiteCONNECT.Controller;
import SQLiteCONNECT.Model.BookTable;
import SQLiteCONNECT.View.BookView;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class BookController extends MouseAdapter {
    private BookView view;
    private BookTable model;
    public BookController(BookView view){
        this.view=view;
        this.view.getBttn2().addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==this.view.getBttn2()){
            model=new BookTable();
            model.loadData();
            this.view.getTable1().setModel(model);
            this.view.getTable1().updateUI();
        }
    }
}