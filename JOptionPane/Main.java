package JOptionPane;
import JOptionPane.Controller.ControllerExample;
import JOptionPane.View.Window;

public class Main {
    public static void main(String[] args) {
        Window win=new Window("JOP example");
        ControllerExample controllerExample=new ControllerExample(win);
    }
}