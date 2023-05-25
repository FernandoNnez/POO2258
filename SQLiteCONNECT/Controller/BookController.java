package SQLiteCONNECT.Controller;
import SQLiteCONNECT.Model.Book;
import SQLiteCONNECT.Model.BookTable;
import SQLiteCONNECT.View.BookView;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class BookController extends MouseAdapter {
    private BookView view;
    private BookTable model;
    public BookController(BookView view){
        this.view=view;
        model=new BookTable();
        this.view.getTable1().setModel(model);
        this.view.getBttn2().addMouseListener(this);
        this.view.getBttn1().addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==this.view.getBttn2()){
            model.loadData();
            this.view.getTable1().setModel(model);
            this.view.getTable1().updateUI();
        }
        if(e.getSource()==this.view.getBttn1()){
            Book book=new Book();
            book.setId(0);
            book.setTitle(this.view.getTxtBox2().getText());
            book.setAuthor(this.view.getTxtBox3().getText());
            if(model.addBook(book)){
                JOptionPane.showMessageDialog(view,"Book added","Warning",JOptionPane.INFORMATION_MESSAGE);
                this.view.cleanTxtBox();
                this.view.getTable1().updateUI();
            }else{
                JOptionPane.showMessageDialog(view,"Can not add to BD, chek connection to BD for add a book","Critical error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}