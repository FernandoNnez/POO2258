package MVC;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
public class Window extends JFrame {
    private JLabel lblId;
    private JLabel lblName;
    private JLabel lblGender;
    private JLabel lblSize;
    private JLabel lblPlataform;
    private JLabel lblDev;
    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtGender;
    private JTextField txtSize;
    private JTextField txtPlatadorm;
    private JTextField txtDev;
    private JButton bttnAdd;
    private GridLayout gridLayout;
    private JPanel pann1;
    private JPanel pann2;
    private ModTableGame model;
    private ArrayList<VideoGame>info;
    private JScrollPane scrollPane;
    private JTable table;
    public Window(String title)throws HeadlessException{
        super(title);
        this.setSize(600,1000);
        gridLayout=new GridLayout(2,1);
        //pann1
        this.setLayout(gridLayout);
        pann1=new JPanel(new FlowLayout());
        pann1.setBackground(new Color(255, 82, 82));
        lblId=new JLabel("Id: ");
        txtId=new JTextField(4);
        pann1.add(lblId);
        pann1.add(txtId);
        lblName=new JLabel("Name: ");
        txtName=new JTextField(20);
        pann1.add(lblName);
        pann1.add(txtName);
        lblGender=new JLabel("Gender: ");
        txtGender=new JTextField(20);
        pann1.add(lblGender);
        pann1.add(txtGender);
        lblSize=new JLabel("Size: ");
        txtSize=new JTextField(20);
        pann1.add(lblSize);
        pann1.add(txtSize);
        lblPlataform=new JLabel("Plataform: ");
        txtPlatadorm=new JTextField(20);
        pann1.add(lblPlataform);
        pann1.add(txtPlatadorm);
        lblDev=new JLabel("Dev: ");
        txtDev=new JTextField(20);
        pann1.add(lblDev);
        pann1.add(txtDev);
        bttnAdd=new JButton("Add Game");
        pann1.add(bttnAdd);

        this.getContentPane().add(pann1,0);
        //pann2
        pann2=new JPanel(new FlowLayout());
        pann2.setBackground(new Color(255, 96, 32));
        this.getContentPane().add(pann2,1);
        info=new ArrayList<>();
        info.add(new VideoGame(1,"NFSMW","Rasing",2.9,"Windows, Mac, PS2,Xbox360","EA"));
        model=new ModTableGame(info);
        table=new JTable(model);
        scrollPane=new JScrollPane(table);
        pann2.add(scrollPane);

        this.getContentPane().add(pann2,1);

        this.bttnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VideoGame neew=new VideoGame();
                neew.setId(Integer.parseInt(txtId.getText()));
                neew.setName(txtName.getText());
                neew.setSizeGB(Double.parseDouble(txtSize.getText()));
                neew.setPlataform(txtPlatadorm.getText());
                neew.setDev(txtDev.getText());
                //info.add(neew);
                model.addGame(neew);
                table.updateUI();
            }
        });
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}