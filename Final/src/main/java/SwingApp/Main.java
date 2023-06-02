package SwingApp;
import SwingApp.Controller.Controller;
import SwingApp.View.ViewGUI;
public class Main {
    public static void main(String[] args) {
        ViewGUI viewModel=new ViewGUI("Mario Bros");
        Controller controller=new Controller(viewModel);
    }
}