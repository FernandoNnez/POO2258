package ImplementacionMVC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Ventana extends JFrame{
    private JLabel lbl1;
    private JTextField txtBox1;
    private JButton bttn1;
    private JComboBox comboBox1;
    private NombreModeloCombo modelo;
    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        setLayout(new FlowLayout());
        lbl1=new JLabel("Ingresa un nombre: ");
        this.getContentPane().add(lbl1);
        txtBox1=new JTextField(30);
        this.getContentPane().add(txtBox1);
        bttn1=new JButton("Agregar");
        this.getContentPane().add(bttn1);
        //config model
        modelo=new NombreModeloCombo();
        modelo.agregarNombre("Diana");
        modelo.agregarNombre("Diego");
        modelo.agregarNombre("Susana");
        comboBox1=new JComboBox<>(modelo);
        this.getContentPane().add(comboBox1);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        bttn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nuevo=txtBox1.getText();
                modelo.agregarNombre(nuevo);
                txtBox1.setText("");
            }
        });
        comboBox1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(comboBox1.getSelectedIndex());
                System.out.println(comboBox1.getSelectedItem());
                JOptionPane.showMessageDialog(null,"Hola "+comboBox1.getSelectedItem());
            }
        });
    }
}
