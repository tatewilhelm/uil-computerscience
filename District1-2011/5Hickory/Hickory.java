// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.lang.*;
import java.io.*;
import java.util.*;


public class Hickory {
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("hickory.dat"));

        boolean end = false;
        int line = 0;
        while(!end)
        {
            if (scan.hasNextLine())
            {
                String s = scan.nextLine();
                line++;
                if (line % 2 == 1)
                {
                    System.out.println(s);
                }
            } else {
                end = true;
            }
        }
    }
}
