import javax.swing.*;

public class  Diagnos {
    public static void main (String[] arg)  {

        int g = Integer.parseInt(JOptionPane.showInputDialog("What number do you want to multiply?")) ;
        int d = 1;
        while (d <= 10) {
            int f = g * d;
            d++;

            JOptionPane.showMessageDialog(null, f);
        }
    }
}
