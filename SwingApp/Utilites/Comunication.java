package SwingApp.Utilites;
import javax.swing.*;
public class Comunication extends JFrame {
    private ImageIcon iconOk=new ImageIcon("Ok.png");
    private ImageIcon iconError=new ImageIcon("Error.png");
    private ImageIcon iconWarning=new ImageIcon("Warning.png");
    private ImageIcon iconQuestion=new ImageIcon("Question.png");
    public String Msgs(String txt, String type){
        if(type=="Message"){
            JOptionPane.showMessageDialog(null,txt,type,JOptionPane.INFORMATION_MESSAGE,iconOk);
        }else if(type=="Error"){
            JOptionPane.showMessageDialog(null,txt,type,JOptionPane.ERROR_MESSAGE,iconError);
        }else if(type=="Warning"){
            JOptionPane.showMessageDialog(null,txt,type,JOptionPane.WARNING_MESSAGE,iconWarning);
        }else if(type=="Confirm"){
            UIManager.put("OptionPane.questionIcon",iconQuestion);
            int confirm=JOptionPane.showConfirmDialog(null,txt,type,JOptionPane.YES_NO_OPTION);
            return String.valueOf(confirm);
        }else if(type=="Input"){
            JOptionPane.showInputDialog(null,txt,type,JOptionPane.QUESTION_MESSAGE);
        }
        return null;
    }
}