package danl.diego_u3_3101;
import javax.swing.JOptionPane;
public class SorteoPatrio {
    public static void main(String[] Diego) {
        byte x;
        double r;
        short z;
        z=Short.parseShort(JOptionPane.showInputDialog("Ingresa el total de tu"
                + " compra "));
        x=Byte.parseByte(JOptionPane.showInputDialog("Selecciona el color de la"
                + " bola obtenida: \n 1-Roja \n 2-Verde \n 3-Blanca"));
        switch(x){
            case 1:
                r=(z*0.50);
                r=z-r;
                JOptionPane.showMessageDialog(null,"El total de tu compra es"
                        + " de: "+r);
                break;
            case 2:
                r=(z*0.25);
                r=z-r;
                JOptionPane.showMessageDialog(null,"El total de tu compra es"
                        + " de: "+r);
                break;
            case 3:
                r=(z*0.05);
                r=z-r;
                JOptionPane.showMessageDialog(null,"El total de tu compra es "
                        + "de: "+r);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion no valida");
        }
    }
}
