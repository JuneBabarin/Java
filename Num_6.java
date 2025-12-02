
/**
 * Write a description of class Num_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Num_6
{
    public static void main (String []args)
    {
        Scanner usrIn = new Scanner(System.in);
        
        int []numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int sum = 0;
        int count = 0;
        for (int nums : numbers){
            if (nums % 2 != 0){
                sum += nums;
                count++;
            }
        }
        
        if (count > 0){
            double average = (double) sum / count;
            System.out.println("Average of all Odd numbers: " + average);
        } else {
            System.out.println("No Odd numbers present.");
        }
    }
}