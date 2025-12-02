
/**
 * Write a description of class smallLARGE here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Num_3
{
    public static void main (String []args)
    {
        int [] nums = {5, 10, 15, 20, 100};
        
        int smallest = nums[0];
        int LARGEST = nums[0];
        for (int x = 0; x < nums.length; x++){
            if (nums[x] < smallest){
                smallest = nums[x];
            }
            
            if (nums[x] > LARGEST){
                LARGEST = nums[x];
            }
        }
        
        System.out.println("Smallest: " + smallest + "\nLargest: " + LARGEST);
    }
}