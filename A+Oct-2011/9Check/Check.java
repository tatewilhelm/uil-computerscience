// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.io.*;
import java.util.*;
import java.lang.Integer;

public class Check {
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("check.dat"));

        int amount = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < amount; i++)
        {
            String first = scan.nextLine();
            String second = scan.nextLine();

            int p1 = Integer.parseInt(first.substring(1, 3));
            int[] p2 = {Integer.parseInt(second.substring(1,2)), Integer.parseInt(second.substring(2,3))};

            System.out.println("  " + p1);
            System.out.println(" x" + p2[0] + "" + p2[1]);
            System.out.println("----");
            int a = p2[1] * p1;
            
            if (a < 10)
            {
                System.out.println("   " + a);
            } else if (a < 100) {
                System.out.println("  " + a);
            } else if (a < 1000) {
                System.out.println(" " + a);
            } else {
                System.out.println(a);
            }

            int b = 10 * (p2[0] * p1);

            if (b < 10)
            {
                System.out.println("   " + b);
            } else if (b < 100) {
                System.out.println("  " + b);
            } else if (b < 1000) {
                System.out.println(" " + b);
            } else {
                System.out.println(b);
            }

            System.out.println("----");

            int c = (((p2[0] * 10) + p2[1]) * p1);

            if (c < 10)
            {
                System.out.println("   " + c);
            } else if (c < 100) {
                System.out.println("  " + c);
            } else if (c < 1000) {
                System.out.println(" " + c);
            } else {
                System.out.println(c);
            }

            System.out.println("");
        }

    }
}
