package Java.core;
import java.util.Scanner;

public class Palindrome {
    public static boolean check(String text){
        /*Create a queue*/
        Queue<Character> q = new Queue<>();
        String newString = "";

        for (int i = text.length()-1; i >= 0 ; i--) {
            /*Get the character at position i and offer in Queue*/
            Character x = text.charAt(i);
            q.offer(x);
        }
        /*If q is not empty then remove (poll) it out the Queue while Queue is empty then stop*/
        while (!q.isEmpty()){
            newString = newString + q.poll();
        }

        /*Check two string (newString and text) have equal.
        if it is equal return true*/
        if(newString.equals(text)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String need to check palindrome: ");
        String checkText = sc.nextLine();
        if(check(checkText)){
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }
    }
}
