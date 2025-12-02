
/**
 * Write a description of class Repeating here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class Num_1
{
    public static void main (String [] args)
    {
        int num = 0;
    
        while (num < 1 || num > 100){
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number: "));
        }
        
        JOptionPane.showMessageDialog(null, "You have Entered number " + num);
    }
}
