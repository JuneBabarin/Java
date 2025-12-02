
/**
 * Write a description of class Count_7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class Num_2
{
    public static void main (String []args)
    {
        int [] nums = {1, 2, 7, 7, 7, 7, 7, 7, 7, 7,};
        
        int  count = 0;
        for (int x = 0; x < nums.length; x++){
            if (nums[x] == 7){
                count++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Numbers of 7:  " + count);
    }
}