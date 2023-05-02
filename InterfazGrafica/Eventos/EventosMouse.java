package InterfazGrafica.Eventos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class EventosMouse implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("Presionado");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println("Soltado");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        //System.out.println("Entró");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        //System.out.println("Salió");
    }
}
