
/**
 * Write a description of class Stars here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Num_4
{
    public static void main (String []args)
    {
        int Lines = 5;
        
        for (int x = 1; x <= Lines; x++){
            for (int y = 1; y <= x; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}