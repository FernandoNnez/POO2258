package SQLiteCONNECT;
import SQLiteCONNECT.Controller.BookController;
import SQLiteCONNECT.View.BookView;
public class Main {
    public static void main(String[] args) {
        BookView viewBook=new BookView("MVC & JDBC");
        BookController controller=new BookController(viewBook);
    }
}