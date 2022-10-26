// Tate Wilhelm, 2022
// https://tatewilhelm.me/

import java.io.*;
import java.util.*;
import java.lang.*;

public class Note {
    static char[] studentsReachable;
    static int srindex = 0;
    static char[][] seatingChart;
    static int y;
    static int x;

    private static boolean inArray(char[] a, char o)
    {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == o)
            {
                return true;
            }
        }
        return false;
    }

    

    private static void nocluewhattonamethis(int xa, int ya)
    {
        // Go through up, down, left right

        boolean uppercase = Character.isUpperCase(seatingChart[ya][xa]);

        try {
            if (ya != 0)
            {
                boolean tuppercase = Character.isUpperCase(seatingChart[ya - 1][xa]);

                if (uppercase == tuppercase && !inArray(studentsReachable, seatingChart[ya - 1][xa]))
                {
                    studentsReachable[srindex] = seatingChart[ya - 1][xa];
                    srindex++;
                    nocluewhattonamethis(xa, ya-1);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {}

        try {
            if (ya + 1 != y)
            {
                boolean tuppercase = Character.isUpperCase(seatingChart[ya + 1][xa]);

                if (uppercase == tuppercase && !inArray(studentsReachable, seatingChart[ya + 1][xa]))
                {
                    studentsReachable[srindex] = seatingChart[ya + 1][xa];
                    srindex++;
                    nocluewhattonamethis(xa, ya+1);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {}

        try {
        if (xa != 0)
        {
            boolean tuppercase = Character.isUpperCase(seatingChart[ya][xa - 1]);

            if (uppercase == tuppercase && !inArray(studentsReachable, seatingChart[ya][xa - 1]))
            {
                studentsReachable[srindex] = seatingChart[ya][xa - 1];
                srindex++;
                nocluewhattonamethis(xa - 1, ya);
            }
        }
        } catch (ArrayIndexOutOfBoundsException e) {}

        try {
            if (xa + 1 != x)
            {
                boolean tuppercase = Character.isUpperCase(seatingChart[ya][xa + 1]);

                if (uppercase == tuppercase && !inArray(studentsReachable, seatingChart[ya][xa + 1]))
                {
                    studentsReachable[srindex] = seatingChart[ya][xa + 1];
                    srindex++;
                    nocluewhattonamethis(xa + 1, ya);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {}


    }

    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(new File("note.dat"));
        
        String l = scan.nextLine();
        y = Integer.parseInt(l.substring(0,1));
        x = Integer.parseInt(l.substring(2,3));
        studentsReachable = new char[x * y];
        seatingChart = new char[y][x];
        

        for (int i = 0; i < y; i++)
        {
            String s = scan.nextLine();

            for (int ii = 0; ii < x; ii++)
            {
                seatingChart[i][ii] = s.charAt(ii);
            }
        }

        int datasets = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < datasets; i++) {
            // Now, find the starting student
            String bigchungusamongusamongussussybakasus = scan.nextLine();
            char startingStudent = bigchungusamongusamongussussybakasus.charAt(0);
            char recievingStudent = bigchungusamongusamongussussybakasus.charAt(1);
            char aboutStudent = bigchungusamongusamongussussybakasus.charAt(2);
            int[] startingStudentPos = new int[2];

            boolean startingStudentFound = false;
            while (!startingStudentFound)
            {


                if (seatingChart[startingStudentPos[1]][startingStudentPos[0]] == startingStudent)
                {
                    startingStudentFound = true;
                } else {

                    startingStudentPos[0]++;
                    if (startingStudentPos[0] == x) {
                        startingStudentPos[0] = 0;
                        startingStudentPos[1]++;
                    }
                }

            }


            
            studentsReachable[srindex] = startingStudent;
            srindex++;

            // Recursion babyyyyyyyyyyyyy
            nocluewhattonamethis(startingStudentPos[0], startingStudentPos[1]);



            if (!inArray(studentsReachable, recievingStudent))
            {
                System.out.println("IMPOSSIBLE");
            } else if (inArray(studentsReachable, aboutStudent))
            {
                System.out.println("INTERCEPTED");
            } else {
                System.out.println("POSSIBLE");
            }
            
            // Reset for the next
            srindex = 0;
            for (int ii = 0; ii < studentsReachable.length; ii++)
            {
                studentsReachable[ii] = 0;
            }
        }

        
    }


}
