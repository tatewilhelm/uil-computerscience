import java.io.*;
import java.lang.*;
import java.util.*;

public class FancyWord
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("fancyword.dat"));
        int x = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < x; i++)
        {
            String word = scan.nextLine();
            
            for (int a = 0; a < word.length(); a++)
            {
                if (a == 0 || a == word.length() - 1)
                {
                    System.out.println(word);
                } else {
                    String o = "";

                    for (int b = 0; b < word.length(); b++)
                    {
                        if (b == a)
                        {
                            o += word.charAt(b);
                        } else if (b == word.length() - a - 1){
                            o += word.charAt(b);
                        } else {
                            o += " ";
                        }
                    }
                    System.out.println(o);
                }
            }
            
            System.out.print("\n");
        }
    }
}
