package KTeam.core;

import java.util.Scanner;

public class TestKT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person a = new Person("Chau", 21, 1.7f);
        a.eat("Rice");

        int age = a.getAge();
        System.out.println("His age:"+age);
        /*try catch*/
        try {
            int[] b = {5,6,7};
            System.out.println(b[4]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index does not exist");
            }
        finally {
            System.out.println("This is end");
        }

        //Example OOP
        /* Person Luan = new Person();
        Luan.name = sc.nextLine();
        Luan.age= Integer.parseInt(sc.nextLine());
        Luan.height= Integer.parseInt(sc.nextLine());
        System.out.println(Luan.name);
        System.out.println(Luan.age);
        System.out.println(Luan.height + " cm");
        */


        /*Person Tien = new Person();
        Tien.name="Tien";
        Tien.age= 21;
        Tien.height=1.5f;
        System.out.println(Tien.name);
        System.out.println(Tien.age);
        System.out.println(Tien.height);
        */

        //Array 2 chieu
        /* int[][] Array2 = new int[2][2];
        Array2[0][0]= 5;
        Array2[0][1]= 6;
        Array2[1][0] =7;
        Array2[1][1]=8;
        for (int i = 0; i < Array2.length; i++) {
            for (int j = 0; j < Array2.length; j++) {
                System.out.println(Array2[i][j]);
            }
        }
        */

        /*
        //Array
        int[] a =new int[3];
        a[0]=1;
        a[1]=3;
        a[2]=6;
        System.out.println(a);
        //Solution 1: for each just read not edit.
        for (int t: a){
            System.out.println(t);
        }
        //Solution 2: Can edit array.
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        char[] b = {'L','U','A','N'};
        System.out.print(b);
        */
    }
}
