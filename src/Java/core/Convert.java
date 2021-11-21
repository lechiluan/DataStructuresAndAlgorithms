package Java.core;

import java.util.Scanner;
// Application of Stack

public class Convert {
    public  static  void convertDecToBin(Integer num, Stack<Integer> s) {
        /* Create a while loop with condition is num not equal 0.*/
        while (num != 0) {
            s.push(num % 2); // Push to Stack remainder of the division
            num = num / 2; // Continue divide 2
        }
        /* Create a while loop with condition is Stack is not empty.*/
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " "); // Pop off the stack and print it
        }
    }
    public static void main (String[] args) {
        Stack<Integer> sInt = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number need to convert: ");
        Integer decNum = Integer.parseInt(sc.nextLine());
        // Function covert Decimal to Binary.
        convertDecToBin(decNum, sInt);
    }
}

