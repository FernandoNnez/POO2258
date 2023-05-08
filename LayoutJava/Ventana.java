package LayoutJava;
import java.awt.*;
import java.io.BufferedReader;
import java.util.concurrent.Flow;

public class Ventana extends Frame {
    private Label lbl1;
    private Label lbl2;
    private TextField txtBox1;
    private TextField txtBox2;
    private Button bttn1;
    private FlowLayout flowLayout1;
    public Ventana(String title) throws HeadlessException {
        super(title);
        flowLayout1=new FlowLayout(FlowLayout.LEFT);
        this.setLayout(flowLayout1);
        lbl1=new Label("Etiqueta 1");
        this.add(lbl1);
        txtBox1=new TextField(20);
        this.add(txtBox1);
        lbl2=new Label("Etiqueta 2");
        this.add(lbl2);
        txtBox2=new TextField(20);
        this.add(txtBox2);

        this.setSize(600,500);
        this.setVisible(true);
    }
}
