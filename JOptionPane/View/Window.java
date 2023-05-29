package JOptionPane.View;
import javax.swing.*;
import java.awt.*;
public class Window extends JFrame{
    private JButton bttn1;
    private JButton bttn2;
    private JButton bttn3;
    private JLabel lbl1;
    public Window(String title) throws HeadlessException {
        super(title);
        this.setSize(400,600);
        bttn1=new JButton("Message");
        bttn2=new JButton("Input");
        bttn3=new JButton("Option");
        lbl1=new JLabel("Result");
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(bttn1);
        this.getContentPane().add(bttn2);
        this.getContentPane().add(bttn3);
        this.getContentPane().add(lbl1);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public JButton getBttn1() {
        return bttn1;
    }
    public void setBttn1(JButton bttn1) {
        this.bttn1 = bttn1;
    }
    public JButton getBttn2() {
        return bttn2;
    }
    public void setBttn2(JButton bttn2) {
        this.bttn2 = bttn2;
    }
    public JButton getBttn3() {
        return bttn3;
    }
    public void setBttn3(JButton bttn3) {
        this.bttn3 = bttn3;
    }
    public JLabel getLbl1() {
        return lbl1;
    }
    public void setLbl1(JLabel lbl1) {
        this.lbl1 = lbl1;
    }
}
