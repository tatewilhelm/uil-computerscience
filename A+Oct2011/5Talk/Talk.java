// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.util.*;
import java.io.*;

public class Talk
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(new File("talk.dat"));

		int sets = scan.nextInt();
		scan.nextLine();
		
		for (int ds = 0; ds < sets; ds++)
		{
			int x = scan.nextInt();
			int y = scan.nextInt();
			int z = scan.nextInt();
			scan.nextLine();

			char[][] seatingChart = new char[y][x];

			for (int i = 0; i < y; i++)
			{
				String line = scan.nextLine();

				for (int ii = 0; ii < line.length(); ii++)
				{
					seatingChart[i][ii] = line.charAt(ii);
				}
			}
			
			boolean studentNearby = false;
			// Repeat per pair
			for (int p = 0; p < z; p++)
			{
				String s = scan.nextLine();
				char s1 = s.charAt(0);
				char s2 = s.charAt(1);

				// Find student1.
				boolean studentFound = false;
				
				int s1x = 0;
			        int s1y = 0;
			

				for (int i = 0; i < y; i++)
				{
					for (int ii = 0; ii < x; ii++)
					{	
						
						if (seatingChart[i][ii] == s1)
						{
							s1x = ii;
							s1y = i;
						}
						
					}
				}

				// Check if student 2 is nearby
				
				for (int i = (s1y - 1); i < (s1y + 2); i++)
				{
					for (int ii = (s1x - 1); ii < (s1x + 2); ii++)
					{
						try 
						{
							if (seatingChart[i][ii] == s2)
							{
								// Uh oh, he's nearby
								System.out.println(Character.toString(s1) + Character.toString(s2));
								studentNearby = true;
							}
						} catch (Exception e) {

						}
					}

				}
			}
			if (!studentNearby)
			{
				System.out.println("OK");
			}

			if (ds != (sets - 1))
			{
				System.out.println("");
			}
		}
	}
}
