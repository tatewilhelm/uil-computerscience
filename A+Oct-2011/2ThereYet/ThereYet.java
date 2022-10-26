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

		int x = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < x; i++)
		{
			String[] s = scan.nextLine().split(" ");

			int h = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[2]);

			m += 30;

			if (m >= 60)
			{
				m -= 60;
				h++;
			}

			System.out.println(h + " hours " + m + " minutes");
			
		}
	}
}
