package JavaSwing;

import javax.management.monitor.MonitorSettingException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaSwing extends JFrame {
    private JLabel lbl1;
    private JTextField txtBox1;
    private JButton bttn1;
    private JLabel lbl2;
    private FlowLayout flowLayout;

    public VentanaSwing(String title) throws HeadlessException {
        super(title);
        this.setSize(200,200);
        flowLayout=new FlowLayout();
        this.getContentPane().setLayout(flowLayout);
        lbl1=new JLabel("Grados C.");
        this.getContentPane().add(lbl1);
        txtBox1=new JTextField(10);
        this.getContentPane().add(txtBox1);
        bttn1=new JButton("Convertir");
        this.getContentPane().add(bttn1);
        lbl2=new JLabel("0.0 °F");
        this.getContentPane().add(lbl2);

        this.setVisible(true);

        this.bttn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double centigrados=Double.parseDouble(txtBox1.getText());
                double farenheid=(centigrados*9.0/5.0)+32.0;
                lbl2.setText(farenheid+" °F");
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Programa Terminado.");
                System.exit(0);
            }
        });
    }
}
