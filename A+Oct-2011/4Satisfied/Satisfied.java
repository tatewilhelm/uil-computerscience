// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.util.*;
import java.io.*;

public class Satisfied
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(new File("satisfied.dat"));

		int lines = Integer.parseInt(scan.nextLine());

		for (int l = 0; l < lines; l++)
		{
			String s = scan.nextLine();
			int p = 0, m = 0;

			for (int i = 0; i < s.length(); i++)
			{
				if (s.charAt(i) == 'p')
				{
					p++;
				} else if (s.charAt(i) == 'm') {
					m++;
				}
			}

			if (p > m) {
				System.out.println("Eat " + (p - m) + " more M&M's.");
			} else if (p < m) {
				System.out.println("Eat " + (m - p) + " more peanuts.");
			} else {
				System.out.println("Satisfied!");
			}
		}
	}
}
