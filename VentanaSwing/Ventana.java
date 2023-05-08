package VentanaSwing;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

public class Ventana extends JFrame {
    private JPanel jPanel1;
    private JButton bttn1;
    private JLabel lbl1;

    private JPanel jPanel2;
    private JLabel jLabel1;

    private JPanel jPanel3;
    private JComboBox<String> comboBoxP3;

    private JPanel jPanel4;
    private GridLayout gridLayout1;
    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(1024,1024);
        gridLayout1=new GridLayout(2,2);
        this.getContentPane().setLayout(gridLayout1);
        //panel 1
        jPanel1=new JPanel();
        jPanel1.setBackground(new Color(255,173,184));
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        bttn1=new JButton("Presióname");
        this.bttn1.setBackground(new Color(122, 122, 122));
        jPanel1.add(bttn1);
        lbl1=new JLabel(">:|");
        jPanel1.add(lbl1);
        bttn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl1.setText(":D");
            }
        });
        this.getContentPane().add(jPanel1,0);
        //panel 2
        String urlIMG="https://planificacionfesaragon.com/sites/default/files/logofes_0.png";
        jPanel2=new JPanel();
        jPanel2.setBackground(new Color(204,56,63));
        jPanel2.setLayout(new FlowLayout());
        try {
            URL url=new URL(urlIMG);
            Image image= ImageIO.read(url);
            ImageIcon icon=new ImageIcon(image);
            jLabel1=new JLabel(icon);
            jPanel2.add(jLabel1);
            this.getContentPane().add(jPanel2,1);
        } catch (MalformedURLException e){
            System.out.println("url no valida.");
        } catch (Exception e){
            System.out.println("ERROR AL CARGAR IMG.");
        }
        //panel 3
        jPanel3=new JPanel();
        jPanel3.setBackground(new Color(255, 8, 8));
        jPanel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[]elementos={"Oa","Oe","Oi"};
        comboBoxP3=new JComboBox<>(elementos);
        comboBoxP3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.paramString().toString());
                System.out.println(comboBoxP3.getSelectedIndex());
            }
        });
        jPanel3.add(comboBoxP3);
        this.getContentPane().add(jPanel3,2);
        //panel 4
        jPanel4=new JPanel();
        jPanel4.setBackground(new Color(252,149,41));
        this.getContentPane().add(jPanel4,3);

        this.setVisible(true);
    }
}
