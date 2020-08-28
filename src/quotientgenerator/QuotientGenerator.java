/*
Nothing here.
 */
package quotientgenerator;
import java.util.Scanner;

/**
 *
 * @author Janis Froehlig
 * 20160125_1501
 */
public class QuotientGenerator
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    String strQ1;
        strQ1 = "Enter Dividend: ";
    System.out.println(strQ1);
    Scanner Reader = new Scanner(System.in);  // Reading from System.in
    int dividend = Reader.nextInt(); // Scans the next token of the input as an int.
    int i;
    int c = 0;
       for  (i = 1;i <= dividend; i++)
       {
            if (dividend % i == 0)
            {
                if (1 == i)
                {
                }
                else if (i == dividend)
                {
                    if (c == 0)
                    {
                        System.out.println(dividend + " is PRIME");
                    }
                }
                else
                {
                    if (i < dividend/i)
                    {
                        System.out.println (i + " x " + dividend/i);
                        c++;
                    }
                }
            }
        }
    }
}




