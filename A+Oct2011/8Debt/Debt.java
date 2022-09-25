// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.io.*;
import java.lang.*;
import java.util.*;


public class Debt
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(new File("debt.dat"));

		boolean next = scan.hasNext();

		while (next)
		{
			double last = scan.nextDouble();
			double now = scan.nextDouble();
			scan.nextLine();

			if ((last/now) - 1 >= .1)
			{
				System.out.println("fleece");
			} else {
				System.out.println("beater");
			}
			next = scan.hasNext();
		}
	}
}
