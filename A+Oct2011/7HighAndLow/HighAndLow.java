// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.io.*;
import java.lang.*;
import java.util.*;

public class HighAndLow
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(new File("highandlow.dat"));

		int amount = scan.nextInt();
		scan.nextLine();

		for (int lines = 0; lines < amount; lines++)
		{
			int[] temp = new int[24];

			for (int i = 0; i < 24; i++)
			{
				temp[i] = scan.nextInt();
			}
			scan.nextLine();
			
			int high = temp[0];
			int low = temp[0];

			for (int i = 0; i < 24; i++)
                        {
                                if (temp[i] < low)
				{
					low = temp[i];
				} 

				if (temp[i] > high)
				{
					high = temp[i];
				}
                        }

			System.out.println("high = " + high + " low = " + low);
                        
			
                        

		}
	}
}
