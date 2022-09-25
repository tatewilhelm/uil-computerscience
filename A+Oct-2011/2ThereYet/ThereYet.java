// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.regex.*;

public class ThereYet
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(new File("thereyet.dat"));

		// Take in amount
		int amount = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < amount; i++)
		{
			// Take in hours / minutes
			String s = scan.nextLine();
			String[] t = s.split(" ");
			int h = Integer.parseInt(t[0]);
			int m = Integer.parseInt(t[2]);

			// Add 30 minutes
			m += 30;

			if (m >= 60)
			{
				m %= 60;
				h++;
			}

			System.out.println(h + " hours " + m + " minutes");

		}
	}
}
