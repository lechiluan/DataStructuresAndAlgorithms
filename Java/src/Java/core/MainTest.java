package Java.core;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values: ");
        String line = sc.nextLine();

//        for (int i = 0; i < 5; i++) {
//            Integer num = Integer.parseInt((sc.nextLine()));
//            s1.push(num);
//        } //cách nhập thứ 2.

        String[] sA = line.split(" ");

        Integer[] iA = new Integer[sA.length];
        for (int i = 0; i < sA.length; i++) {
            iA[i] = Integer.parseInt((sA[i]));
            s1.push(iA[i]);
        }

//        System.out.print("Stack after push values: ");
//        s1.peek();
//        s1.traverse();
        System.out.print("\nTop value of stack: ");
        System.out.print(s1.peek());
    }
}



//        Stack<Integer> sInt = new Stack<>();
//        System.out.println("Test push");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter value: ");
//        for (int i = 0; i < 5; i ++) {
//            Integer num = Integer.parseInt((sc.nextLine()));
//            sInt.push(num);
//        }
//        System.out.print("Value of stack is: ");
//        sInt.traverse();
//        System.out.print("\n");
//        System.out.printf("Size of list: %d", sInt.isEmpty());


//        LinkedList<Integer> sInt = new SinglyLinkedList<>();
//        System.out.println("Test size");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Insert the size of your list: ");
//        Integer n = Integer.parseInt(sc.nextLine());
//        for (int i = 1; i <= n; i++) {
//            Integer x = Integer.parseInt(sc.nextLine());
//            sInt.addLast(x);
//        }
//        System.out.print("List is: ");
//        sInt.traverse();
//        System.out.print("\n");
//        System.out.printf("Size of list: %d", sInt.isEmpty());




//

//    }




//        sInt.removeFirst();
//        System.out.print("\nThe list include:");
//        sInt.traverse();

//    //Test StackException
//    Stack<Integer> sInt = new Stack<>();
//        sInt.push(new Integer(2));
//                sInt.push(new Integer(3));
//                sInt.push(new Integer(4));
//                sInt.push(new Integer(5));
//                System.out.println("Before: "+sInt.size());
//                System.out.println("Value top:  "+sInt.peek());
//                sInt.clear();
//                System.out.println("After: "+sInt.size());





//                //Test Queue
//                Queue<Integer> sInt = new Queue<>();
//        sInt.offer(new Integer(2));
//        sInt.offer(new Integer(3));
//        sInt.offer(new Integer(4));
//        sInt.offer(new Integer(5));
//        sInt.poll();
//        sInt.traverse();
