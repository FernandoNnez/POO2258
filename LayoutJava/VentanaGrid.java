package LayoutJava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class VentanaGrid extends Frame {
    private Label lbl1;
    private Label lbl2;
    private TextField txtBox1;
    private TextField txtBox2;
    private Button bttn1;
    private FlowLayout flowLayout1;
    private GridLayout gridLayout1;
    public VentanaGrid(String title) throws HeadlessException {
        super(title);
        gridLayout1=new GridLayout(3,2);
        this.setSize(800,600);
        this.setLayout(gridLayout1);
        lbl1=new Label("Etiqueta1");
        this.add(lbl1,0);
        txtBox1=new TextField(30);
        this.add(txtBox1,1);
        lbl2=new Label("Etiqueta2");
        this.add(lbl2,2);
        txtBox2=new TextField(30);
        this.add(txtBox2,3);
        bttn1=new Button("Presioname");
        this.add(bttn1,4);
        bttn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String txt=txtBox1.getText()+" "+txtBox2.getText();
                JOptionPane.showMessageDialog(null, txt);
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}