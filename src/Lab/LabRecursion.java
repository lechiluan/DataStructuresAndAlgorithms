package Lab;


import java.util.Scanner;

public class LabRecursion {
    // java implementation to print the given
    // pattern recursively
    // function to print the 'n-th' row
    // of the pattern recursively
    static void printPatternRowRecur(int n) {
            // base condition
            if (n < 1)
                return;
            // print the remnaining stars
            // of the n-th row recursively
            System.out.print( "* ");
            printPatternRowRecur(n - 1);
    }
    static void printPatternRecur(int n) {
        // base condition
        if (n < 1)
            return;

        // print the stars of the n-th row
        printPatternRowRecur(n);

        // move to next line
        System.out.println ();

        // print stars of the
        // remaining rows recursively
        printPatternRecur(n - 1);
    }

    public static void printFigure(int n){
        if (n == 0) {
            return;
        }
        //Todo Add bottom
        printLineOfChars('*',n);
        printFigure(n - 1);
        printLineOfChars('#',n);
    }

    private static void printLineOfChars(char c, int n) {
        System.out.print(c);
        printFigure(n - 1);
    }

    // Driver program to test above
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printFigure(n);
        //printPatternRecur(n);
    }
}

