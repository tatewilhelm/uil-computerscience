// Unsolved!

import java.io.File;
import java.util.Scanner;

public class Save
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("save.dat"));

        double amount = scan.nextInt();
        scan.nextLine();

        String[] strs = scan.nextLine().split(" ");
        double p = Double.parseDouble(strs[0]);
        double n = Double.parseDouble(strs[1]);
        double r = Double.parseDouble(strs[2]);

        double balance = (p * (Math.pow((1 + r), n) - 1)) / r;

        // Round
        balance = Math.round(balance * 100) / 100;

        String out = Double.toString(balance);

        System.out.println(Double.toString(1));
        System.out.println(Double.toString(1.10));
        System.out.println(Double.toString(1.11));


    }
}
