package JOptionPane.Controller;
import JOptionPane.View.Window;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class ControllerExample extends MouseAdapter {
    private Window window;
    public ControllerExample(Window window) {
        this.window=window;
        this.window.getBttn1().addMouseListener(this);
        this.window.getBttn2().addMouseListener(this);
        this.window.getBttn3().addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()== window.getBttn1()){
            ImageIcon icon=new ImageIcon("Ok.png");
            JOptionPane.showMessageDialog(window,"This is a Message from ControllerExample","Title",JOptionPane.INFORMATION_MESSAGE,icon);
        }
        if(e.getSource()== window.getBttn2()){
            String data=JOptionPane.showInputDialog(window,"Input Example","Title",JOptionPane.QUESTION_MESSAGE);
            this.window.getLbl1().setText(data);
        }
        if(e.getSource()== window.getBttn3()){
            int confirm=JOptionPane.showConfirmDialog(window,"Are You sure?","Delete?",JOptionPane.YES_NO_OPTION);
            //window.getLbl1().setText(""+confirm);
            if(confirm==JOptionPane.YES_NO_OPTION){
                window.getLbl1().setText("Ye");
            }else{
                window.getLbl1().setText("Nope");
            }
        }
    }
}