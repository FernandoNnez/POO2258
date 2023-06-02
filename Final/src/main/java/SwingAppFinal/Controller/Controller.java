package SwingAppFinal.Controller;
import SwingAppFinal.Model.Mod;
import SwingAppFinal.Model.ModTable;
import SwingAppFinal.Utilites.Comunication;
import SwingAppFinal.View.ViewGUI;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
public class Controller extends MouseAdapter {
    Comunication comunication=new Comunication();
    private ViewGUI view;
    private ModTable model;
    public Controller(ViewGUI view){
        this.view=view;
        model=new ModTable();
        this.view.getTable1().setModel(model);
        this.view.getBttn2().addMouseListener(this);
        this.view.getBttn1().addMouseListener(this);
        this.view.getTable1().addMouseListener(this);
        this.view.getBttnUpdate().addMouseListener(this);
        this.view.getBttnDelete().addMouseListener(this);
    }
    public void cleanTxtBox(){
        this.view.getTxtBoxTab2().setText("");
        this.view.getTxtBoxTab3().setText("");
        this.view.getTxtBoxTab4().setText("");
        this.view.getTxtBoxTab5().setText("");
        this.view.getTxtBoxTab6().setText("");
        this.view.getTxtBoxFx1().setText("");
        this.view.getTxtBoxFx2().setText("");
        this.view.getTxtBoxFx3().setText("");
        this.view.getTxtBoxFx4().setText("");
        this.view.getTxtBoxFx5().setText("");
        this.view.getTxtBoxFx6().setText("");
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==this.view.getBttn2()){
            model.loadData();
            this.view.getTable1().setModel(model);
            this.view.getTable1().updateUI();
        }
        if(e.getSource()==this.view.getTable1()){
            int rowIndex = view.getTable1().getSelectedRow();
            int columnIndex = view.getTable1().getColumnCount() - 1;//IMPORTANTE EL -1
            String url = view.getTable1().getValueAt(rowIndex, columnIndex).toString();
            view.getTxtBoxFx1().setText(view.getTable1().getValueAt(rowIndex,0).toString());
            view.getTxtBoxFx2().setText(view.getTable1().getValueAt(rowIndex,1).toString());
            view.getTxtBoxFx3().setText(view.getTable1().getValueAt(rowIndex,2).toString());
            view.getTxtBoxFx4().setText(view.getTable1().getValueAt(rowIndex,3).toString());
            view.getTxtBoxFx5().setText(view.getTable1().getValueAt(rowIndex,4).toString());
            view.getTxtBoxFx6().setText(view.getTable1().getValueAt(rowIndex,5).toString());
            try {
                URL imageUrl = new URL(url);
                Image image= ImageIO.read(imageUrl);
                ImageIcon imageIcon=new ImageIcon(image);
                view.getLbl4().setIcon(imageIcon);
            }catch(MalformedURLException ea){
                comunication.Msgs("Invalid URL link","Error");
            }catch(Exception ea){
                comunication.Msgs("Failed to load URL Image.","Error");
            }
        }
        if(e.getSource()==this.view.getBttn1()){
            Mod mod=new Mod();
            if (this.view.getTxtBoxTab2().getText().isEmpty()||this.view.getTxtBoxTab3().getText().isEmpty()||this.view.getTxtBoxTab4().getText().isEmpty()||this.view.getTxtBoxTab5().getText().isEmpty()||this.view.getTxtBoxTab6().getText().isEmpty()) {
                comunication.Msgs("Text fields cannot be empty","Error");
                throw new IllegalArgumentException("TextField empty");
            }
            mod.setID(0);
            mod.setName(this.view.getTxtBoxTab2().getText());
            mod.setHostile(this.view.getTxtBoxTab3().getText());
            mod.setGender(this.view.getTxtBoxTab4().getText());
            mod.setLivingPlace(this.view.getTxtBoxTab5().getText());
            mod.setURL(this.view.getTxtBoxTab6().getText());
            if(model.addItem(mod)){
                comunication.Msgs("Item added","Message");
                model.loadData();
                cleanTxtBox();
                this.view.getTable1().updateUI();
            }else{
                comunication.Msgs("Can not add to DB, check connection to DB for add an item or contact to support for more details","Error");
            }
        }
        if(e.getSource()==view.getBttnUpdate()){
            Mod mod=new Mod();
            if (this.view.getTxtBoxFx1().getText().isEmpty()||this.view.getTxtBoxFx2().getText().isEmpty()||this.view.getTxtBoxFx3().getText().isEmpty()||this.view.getTxtBoxFx4().getText().isEmpty()||this.view.getTxtBoxFx5().getText().isEmpty()||this.view.getTxtBoxFx6().getText().isEmpty()) {
                comunication.Msgs("Text fields cannot be empty","Error");
                throw new IllegalArgumentException("TextField empty");
            }else if (view.getTxtBoxFx1().getText().matches("\\d+")) {
                mod.setID(Integer.parseInt(this.view.getTxtBoxFx1().getText()));
                mod.setName(this.view.getTxtBoxFx2().getText());
                mod.setHostile(this.view.getTxtBoxFx3().getText());
                mod.setGender(this.view.getTxtBoxFx4().getText());
                mod.setLivingPlace(this.view.getTxtBoxFx5().getText());
                mod.setURL(this.view.getTxtBoxFx6().getText());
                int confirm= Integer.parseInt((comunication.Msgs("ARE YOU SURE?","Confirm")));
                if(confirm==0){
                    if(model.updateItem(mod)){
                        comunication.Msgs("An item has ben UPDATED from DB","Message");
                        model.loadData();
                        cleanTxtBox();
                        this.view.getTable1().updateUI();
                    }else{
                        comunication.Msgs("Can not update item from DB","Error");
                    }
                }
            }else{
                comunication.Msgs("Type only numbers","Error");
            }
        }
        if(e.getSource()==view.getBttnDelete()){
            if (this.view.getTxtBoxFx1().getText().isEmpty()){
                comunication.Msgs("ID cannot be empty","Error");
                throw new IllegalArgumentException("ID empty");
            }else if (view.getTxtBoxFx1().getText().matches("\\d+")) {
                int confirm= Integer.parseInt((comunication.Msgs("ARE YOU SURE?","Confirm")));
                if(confirm==0){
                    if(model.deleteItem(Integer.parseInt(view.getTxtBoxFx1().getText()))){
                        comunication.Msgs("An item has ben DELETED from DB","Message");
                        model.loadData();
                        cleanTxtBox();
                        view.getLbl4().setIcon(new ImageIcon("Ok.png"));
                        this.view.getTable1().updateUI();
                    }else{
                        comunication.Msgs("Can not delete item from DB","Error");
                    }
                }
            } else {
                comunication.Msgs("Type only numbers","Error");
            }
        }
    }
}