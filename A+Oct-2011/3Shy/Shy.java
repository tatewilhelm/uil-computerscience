// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.util.*;
import java.io.*;

public class Shy
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(new File("shy.dat"));

		int lines = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < lines; i++)
		{
			String row = scan.nextLine();
			String output = new String();
			for (int ii = 0; ii < row.length(); ii++)
			{
				char c = row.charAt(ii);

				if (c == 'x')
				{
					output += 'x';
				} else if (ii == 0 || ii == (row.length() - 1) ) {
					output += 'o';
				} else if (row.charAt(ii - 1) == 'f' && row.charAt(ii + 1) == 'f') {
					output += 'o';
				} else {
					output += 'f';
				}
			}

			System.out.println(output);
		}
	}
}
