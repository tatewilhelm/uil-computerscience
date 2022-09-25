// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.lang.*;
import java.io.*;
import java.util.*;


public class Diamonds {
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("diamonds.dat"));

        int x = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < x; i++)
        {
            String s = scan.nextLine();
            char c = s.split(" ")[0].charAt(0);
            int l = Integer.parseInt(s.split(" ")[1]);
            int a = l / 2;
            int b = l / 2;
            
            for (int ii = 0; ii < l; ii++)
            {
                String out = new String();
                for (int iii = 0; iii < a; iii++)
                {
                    out += " ";
                }

                out += c;

                for (int iii = a + 1; iii < b; iii++)
                {
                    out += " ";
                }
                
                if (a != b)
                {
                out += c;
                }

                System.out.println(out);

                if (ii < l/2)
                {
                    a--;
                    b++;
                } else {
                    b--;
                    a++;
                }
            }
            System.out.println(" ");

        }
    } 
}

