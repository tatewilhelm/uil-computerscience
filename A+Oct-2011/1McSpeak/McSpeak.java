// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.io.*;
import java.util.*;

public class McSpeak 
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(new File("mcspeak.dat"));

		int amount = scan.nextInt();
		scan.nextLine();

		for(int i = 0; i < amount; i++)
		{
			String str = scan.nextLine();
			System.out.println("Mc"+str);
		}
	}
}
