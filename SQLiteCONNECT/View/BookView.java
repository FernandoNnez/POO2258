package SQLiteCONNECT.View;
import javax.swing.*;
import java.awt.*;
public class BookView extends JFrame {
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JTextField txtBox1;
    private JTextField txtBox2;
    private JTextField txtBox3;
    private JButton bttn1;
    private JButton bttn2;
    private JTable table1;
    private JScrollPane scrollPane1;
    private GridLayout layout;
    private JPanel pannel1;
    private JPanel pannel2;
    private JPanel pannel3;
    private JPanel pannel4;
    public BookView(String title) throws HeadlessException {
        super(title);
        this.setSize(1200,950);
        layout=new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //pannel1
        pannel1=new JPanel(new FlowLayout());
        pannel1.setBackground(new Color(255, 44, 44));
        lbl1=new JLabel("Id: ");
        lbl2=new JLabel("Title: ");
        lbl3=new JLabel("Author: ");
        txtBox1=new JTextField(5);
        txtBox1.setText("0");
        txtBox1.setEnabled(false);
        txtBox2=new JTextField(15);
        txtBox3=new JTextField(15);
        bttn1=new JButton("Add");
        pannel1.add(lbl1);
        pannel1.add(lbl2);
        pannel1.add(lbl3);
        pannel1.add(txtBox1);
        pannel1.add(txtBox2);
        pannel1.add(txtBox3);
        pannel1.add(bttn1);
        //pannel2
        pannel2=new JPanel(new FlowLayout());
        pannel2.setBackground(new Color(152, 255, 27));
        bttn2=new JButton("Load");
        table1=new JTable();
        scrollPane1=new JScrollPane(table1);
        pannel2.add(scrollPane1);
        pannel2.add(bttn2);
        //pannel3
        pannel3=new JPanel(new FlowLayout());
        pannel3.setBackground(new Color(62, 205, 255));
        //pannel4
        pannel4=new JPanel(new FlowLayout());
        pannel4.setBackground(new Color(255, 221, 0));

        this.getContentPane().add(pannel1,0);
        this.getContentPane().add(pannel2,1);
        this.getContentPane().add(pannel3,2);
        this.getContentPane().add(pannel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public JLabel getLbl1() {
        return lbl1;
    }
    public void setLbl1(JLabel lbl1) {
        this.lbl1 = lbl1;
    }
    public JLabel getLbl2() {
        return lbl2;
    }
    public void setLbl2(JLabel lbl2) {
        this.lbl2 = lbl2;
    }
    public JLabel getLbl3() {
        return lbl3;
    }
    public void setLbl3(JLabel lbl3) {
        this.lbl3 = lbl3;
    }
    public JTextField getTxtBox1() {
        return txtBox1;
    }
    public void setTxtBox1(JTextField txtBox1) {
        this.txtBox1 = txtBox1;
    }
    public JTextField getTxtBox2() {
        return txtBox2;
    }
    public void setTxtBox2(JTextField txtBox2) {
        this.txtBox2 = txtBox2;
    }
    public JTextField getTxtBox3() {
        return txtBox3;
    }
    public void setTxtBox3(JTextField txtBox3) {
        this.txtBox3 = txtBox3;
    }
    public JButton getBttn1() {
        return bttn1;
    }
    public void setBttn1(JButton bttn1) {
        this.bttn1 = bttn1;
    }
    public JTable getTable1() {
        return table1;
    }
    public void setTable1(JTable table1) {
        this.table1 = table1;
    }
    public JScrollPane getScrollPane1() {
        return scrollPane1;
    }
    public void setScrollPane1(JScrollPane scrollPane1) {
        this.scrollPane1 = scrollPane1;
    }
    @Override
    public GridLayout getLayout() {
        return layout;
    }
    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }
    public JPanel getPannel1() {
        return pannel1;
    }
    public void setPannel1(JPanel pannel1) {
        this.pannel1 = pannel1;
    }
    public JPanel getPannel2() {
        return pannel2;
    }
    public void setPannel2(JPanel pannel2) {
        this.pannel2 = pannel2;
    }
    public JPanel getPannel3() {
        return pannel3;
    }
    public void setPannel3(JPanel pannel3) {
        this.pannel3 = pannel3;
    }
    public JPanel getPannel4() {
        return pannel4;
    }
    public void setPannel4(JPanel pannel4) {
        this.pannel4 = pannel4;
    }
    public JButton getBttn2() {
        return bttn2;
    }
    public void setBttn2(JButton bttn2) {
        this.bttn2 = bttn2;
    }
    public void cleanTxtBox(){
        txtBox2.setText("");
        txtBox3.setText("");
    }
}