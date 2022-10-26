import java.io.File;
import java.util.Scanner;

public class Square 
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("square.dat"));

        int x = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < x; i++)
        {
            int a = scan.nextInt();
            if (scan.hasNextLine())
            {
            scan.nextLine();
            }

            for (int ii = 0; ii < a; ii++)
            {
                for (int iii = 0; iii < a; iii++)
                {
                    System.out.print('X');
                }
                System.out.print('\n');
            }
            System.out.print('\n');
        }
    }    
}
