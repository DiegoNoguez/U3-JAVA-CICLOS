package danl.diego_u3_3101;
import javax.swing.JOptionPane;
public class Factorial {
    public static void main(String[] diego){
        int z;
        int b=10;
        for(z=10;z>=1;z--){
            b=b-1;
            System.out.println(""+b);
            b*=z;
        }
        JOptionPane.showMessageDialog(null,"El resultado es: "+b);
    }
    
}
