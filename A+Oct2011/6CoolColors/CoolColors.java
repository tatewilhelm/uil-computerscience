// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.io.*;
import java.util.*;

public class CoolColors
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(new File("coolcolors.dat"));

		// Check if no more next
		boolean next = scan.hasNext();

		while (next)
		{
			String s = scan.nextLine();
			String output = new String();

			for (int i = 0; i < s.length(); i++)
			{
				if (s.charAt(i) == 'b')
				{
					output += 'b';
				} else {
					output += ' ';
				}
			}

			System.out.println(output);
			next = scan.hasNext();
		}
		
	}
}
