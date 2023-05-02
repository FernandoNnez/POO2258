package InterfazGrafica.UI;
import InterfazGrafica.Eventos.EventosMouse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainUI extends Frame{
    private Label label1;
    private TextField textField1;
    private Button button1;
    public MainUI(String title) throws HeadlessException{
        super(title);
        this.setSize(600,800);
        this.setLayout(new FlowLayout());
        label1=new Label("Nombre");
        this.add(label1);
        textField1=new TextField(30);
        this.add(textField1);
        button1=new Button("Accionar");
        //button1.addMouseListener(new EventosMouse());
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(textField1.getText());
                JOptionPane.showMessageDialog(null,"Hola"+textField1.getText());
            }
        });
        this.add(button1);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }
}