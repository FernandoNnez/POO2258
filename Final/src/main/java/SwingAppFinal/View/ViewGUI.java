package SwingAppFinal.View;
import javax.swing.*;
import java.awt.*;
public class ViewGUI extends JFrame {
    private JLabel lblTab1;
    private JLabel lblTab2;
    private JLabel lblTab3;
    private JLabel lblTab4;
    private JLabel lblTab5;
    private JLabel lblTab6;
    private JLabel lblFx1;
    private JLabel lblFx2;
    private JLabel lblFx3;
    private JLabel lblFx4;
    private JLabel lblFx5;
    private JLabel lblFx6;
    private JLabel lbl4;
    private JTextField txtBoxTab1;
    private JTextField txtBoxTab2;
    private JTextField txtBoxTab3;
    private JTextField txtBoxTab4;
    private JTextField txtBoxTab5;
    private JTextField txtBoxTab6;
    private JTextField txtBoxFx1;
    private JTextField txtBoxFx2;
    private JTextField txtBoxFx3;
    private JTextField txtBoxFx4;
    private JTextField txtBoxFx5;
    private JTextField txtBoxFx6;
    private JButton bttn1;
    private JButton bttn2;
    private JButton bttnUpdate;
    private JButton bttnDelete;
    private JTable table1;
    private JScrollPane scrollPane1;
    private GridLayout layout;
    private JPanel pannel1;
    private JPanel pannel2;
    private JPanel pannel3;
    private JPanel pannel4;
    public ViewGUI(String title) throws HeadlessException {
        super(title);
        this.setSize(1000,1000);
        layout=new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //pannel1
        pannel1=new JPanel(new FlowLayout());
        pannel1.setBackground(new Color(0, 156, 218));
        lblTab1=new JLabel("ID: ");
        lblTab2=new JLabel("Name: ");
        lblTab3=new JLabel("Hostile: ");
        lblTab4=new JLabel("Gender: ");
        lblTab5=new JLabel("Living Place: ");
        lblTab6=new JLabel("URL: ");
        txtBoxTab1=new JTextField(5);
        txtBoxTab2=new JTextField(5);
        txtBoxTab3=new JTextField(5);
        txtBoxTab4=new JTextField(5);
        txtBoxTab5=new JTextField(5);
        txtBoxTab6=new JTextField(5);
        txtBoxTab1.setText("0");
        txtBoxTab1.setEnabled(false);
        bttn1=new JButton("Add");
        pannel1.add(lblTab1);
        pannel1.add(txtBoxTab1);
        pannel1.add(lblTab2);
        pannel1.add(txtBoxTab2);
        pannel1.add(lblTab3);
        pannel1.add(txtBoxTab3);
        pannel1.add(lblTab4);
        pannel1.add(txtBoxTab4);
        pannel1.add(lblTab5);
        pannel1.add(txtBoxTab5);
        pannel1.add(lblTab6);
        pannel1.add(txtBoxTab6);
        pannel1.add(bttn1);
        //pannel2
        pannel2=new JPanel(new FlowLayout());
        pannel2.setBackground(new Color(252, 208, 0));
        bttn2=new JButton("Load");
        table1=new JTable();
        scrollPane1=new JScrollPane(table1);
        pannel2.add(scrollPane1);
        pannel2.add(bttn2);
        //pannel3
        pannel3=new JPanel(new FlowLayout());
        pannel3.setBackground(new Color(231, 30, 7));
        lbl4=new JLabel();
        pannel3.add(lbl4);
        //pannel4
        pannel4=new JPanel(new FlowLayout());
        pannel4.setBackground(new Color(66, 176, 50));
        lblFx1=new JLabel("ID: ");
        lblFx2=new JLabel("Name: ");
        lblFx3=new JLabel("Hostile: ");
        lblFx4=new JLabel("Gender: ");
        lblFx5=new JLabel("Living Place: ");
        lblFx6=new JLabel("URL: ");
        bttnUpdate=new JButton("Update Element");
        bttnDelete=new JButton("Delete Element");
        txtBoxFx1=new JTextField(5);
        txtBoxFx2=new JTextField(5);
        txtBoxFx3=new JTextField(5);
        txtBoxFx4=new JTextField(5);
        txtBoxFx5=new JTextField(5);
        txtBoxFx6=new JTextField(5);
        pannel4.add(bttnUpdate);
        pannel4.add(bttnDelete);
        pannel4.add(lblFx1);
        pannel4.add(txtBoxFx1);
        pannel4.add(lblFx2);
        pannel4.add(txtBoxFx2);
        pannel4.add(lblFx3);
        pannel4.add(txtBoxFx3);
        pannel4.add(lblFx4);
        pannel4.add(txtBoxFx4);
        pannel4.add(lblFx5);
        pannel4.add(txtBoxFx5);
        pannel4.add(lblFx6);
        pannel4.add(txtBoxFx6);
        this.getContentPane().add(pannel1,0);
        this.getContentPane().add(pannel2,1);
        this.getContentPane().add(pannel3,2);
        this.getContentPane().add(pannel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblTab1() {
        return lblTab1;
    }

    public void setLblTab1(JLabel lblTab1) {
        this.lblTab1 = lblTab1;
    }

    public JLabel getLblTab2() {
        return lblTab2;
    }

    public void setLblTab2(JLabel lblTab2) {
        this.lblTab2 = lblTab2;
    }

    public JLabel getLblTab3() {
        return lblTab3;
    }

    public void setLblTab3(JLabel lblTab3) {
        this.lblTab3 = lblTab3;
    }

    public JLabel getLblTab4() {
        return lblTab4;
    }

    public void setLblTab4(JLabel lblTab4) {
        this.lblTab4 = lblTab4;
    }

    public JLabel getLblTab5() {
        return lblTab5;
    }

    public void setLblTab5(JLabel lblTab5) {
        this.lblTab5 = lblTab5;
    }

    public JLabel getLblTab6() {
        return lblTab6;
    }

    public void setLblTab6(JLabel lblTab6) {
        this.lblTab6 = lblTab6;
    }

    public JLabel getLblFx1() {
        return lblFx1;
    }

    public void setLblFx1(JLabel lblFx1) {
        this.lblFx1 = lblFx1;
    }

    public JLabel getLblFx2() {
        return lblFx2;
    }

    public void setLblFx2(JLabel lblFx2) {
        this.lblFx2 = lblFx2;
    }

    public JLabel getLblFx3() {
        return lblFx3;
    }

    public void setLblFx3(JLabel lblFx3) {
        this.lblFx3 = lblFx3;
    }

    public JLabel getLblFx4() {
        return lblFx4;
    }

    public void setLblFx4(JLabel lblFx4) {
        this.lblFx4 = lblFx4;
    }

    public JLabel getLblFx5() {
        return lblFx5;
    }

    public void setLblFx5(JLabel lblFx5) {
        this.lblFx5 = lblFx5;
    }

    public JLabel getLblFx6() {
        return lblFx6;
    }

    public void setLblFx6(JLabel lblFx6) {
        this.lblFx6 = lblFx6;
    }

    public JLabel getLbl4() {
        return lbl4;
    }

    public void setLbl4(JLabel lbl4) {
        this.lbl4 = lbl4;
    }

    public JTextField getTxtBoxTab1() {
        return txtBoxTab1;
    }

    public void setTxtBoxTab1(JTextField txtBoxTab1) {
        this.txtBoxTab1 = txtBoxTab1;
    }

    public JTextField getTxtBoxTab2() {
        return txtBoxTab2;
    }

    public void setTxtBoxTab2(JTextField txtBoxTab2) {
        this.txtBoxTab2 = txtBoxTab2;
    }

    public JTextField getTxtBoxTab3() {
        return txtBoxTab3;
    }

    public void setTxtBoxTab3(JTextField txtBoxTab3) {
        this.txtBoxTab3 = txtBoxTab3;
    }

    public JTextField getTxtBoxTab4() {
        return txtBoxTab4;
    }

    public void setTxtBoxTab4(JTextField txtBoxTab4) {
        this.txtBoxTab4 = txtBoxTab4;
    }

    public JTextField getTxtBoxTab5() {
        return txtBoxTab5;
    }

    public void setTxtBoxTab5(JTextField txtBoxTab5) {
        this.txtBoxTab5 = txtBoxTab5;
    }

    public JTextField getTxtBoxTab6() {
        return txtBoxTab6;
    }

    public void setTxtBoxTab6(JTextField txtBoxTab6) {
        this.txtBoxTab6 = txtBoxTab6;
    }

    public JTextField getTxtBoxFx1() {
        return txtBoxFx1;
    }

    public void setTxtBoxFx1(JTextField txtBoxFx1) {
        this.txtBoxFx1 = txtBoxFx1;
    }

    public JTextField getTxtBoxFx2() {
        return txtBoxFx2;
    }

    public void setTxtBoxFx2(JTextField txtBoxFx2) {
        this.txtBoxFx2 = txtBoxFx2;
    }

    public JTextField getTxtBoxFx3() {
        return txtBoxFx3;
    }

    public void setTxtBoxFx3(JTextField txtBoxFx3) {
        this.txtBoxFx3 = txtBoxFx3;
    }

    public JTextField getTxtBoxFx4() {
        return txtBoxFx4;
    }

    public void setTxtBoxFx4(JTextField txtBoxFx4) {
        this.txtBoxFx4 = txtBoxFx4;
    }

    public JTextField getTxtBoxFx5() {
        return txtBoxFx5;
    }

    public void setTxtBoxFx5(JTextField txtBoxFx5) {
        this.txtBoxFx5 = txtBoxFx5;
    }

    public JTextField getTxtBoxFx6() {
        return txtBoxFx6;
    }

    public void setTxtBoxFx6(JTextField txtBoxFx6) {
        this.txtBoxFx6 = txtBoxFx6;
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

    public JButton getBttnUpdate() {
        return bttnUpdate;
    }

    public void setBttnUpdate(JButton bttnUpdate) {
        this.bttnUpdate = bttnUpdate;
    }

    public JButton getBttnDelete() {
        return bttnDelete;
    }

    public void setBttnDelete(JButton bttnDelete) {
        this.bttnDelete = bttnDelete;
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
}