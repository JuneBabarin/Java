
/**
 * Write a description of class Num_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Num_5
{
    public static void main (String []args)
    {
        Scanner usrIn = new Scanner(System.in);
        int [] numbers = new int[10];
        for (int x = 0; x < numbers.length; x++){
            numbers[x] = usrIn.nextInt();
        }
        
        int targNum = 9;
        for (int x = 0; x < numbers.length; x++){
            if (numbers[x] == targNum){
                System.out.println("Found " + targNum + " at index " + x + ".");
                break;
            }
        }
        System.out.println("Loop Finished.");
        
        boolean found = false;
        for (int nums : numbers) {
            if (nums == targNum) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(targNum + " was not found in the array.");
        }
    }
}