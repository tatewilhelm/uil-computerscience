// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.util.*;
import java.lang.*;
import java.io.*;


public class Beautiful {

    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("beautiful.dat"));

        ArrayList<Double> amt = new ArrayList<Double>();

        int x = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < x; i++)
        {
            amt.add(Double.parseDouble(scan.nextLine().split(" ")[1]));
        }

        double sum = 0;

        for (int i = 0; i < x; i++)
        {
            sum += amt.get(i);
        }

        System.out.println("$" + sum);

    }
    
}
