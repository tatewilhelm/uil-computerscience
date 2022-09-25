// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.lang.*;
import java.io.*;
import java.util.*;


public class Elevator {
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("elevator.dat"));
        
        int x = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < x; i++)
        {
            String[] strings = scan.nextLine().split(" ");
            int[] ints = new int[strings.length];

            for (int ii = 0; ii < strings.length; ii++)
            {
                ints[ii] = Integer.parseInt(strings[ii]);
            }

            boolean capacityReached = false;

            int sum = 0;
            int iterator = 0;
            while (!capacityReached)
            {
                sum += ints[iterator];

                if (sum > 2000)
                {
                    System.out.println(iterator);
                    capacityReached = true;
                } else {
                    iterator++;
                }
            }
        }
    }
}
