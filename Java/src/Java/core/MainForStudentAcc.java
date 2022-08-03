package Java.core;

import java.util.Scanner;

public class MainForStudentAcc {
    static Scanner sc=new Scanner(System.in);

    public  static void findByYear(LinkedList<StudentAcc> sdt1, Short year){
        int result = 0;
        //if(std1.size>0)
        if(!sdt1.isEmpty()){
            Node<StudentAcc> e = sdt1.getHead();
            while (e!=null){
                if(e.getValue().getBirthYear().equals(year)){
                System.out.print((e.getValue().getUname()+"\n"));
                result++;
                }
                e = e.next;
            }
        }
        System.out.println("Result:"+ result);
    }

    public static void insert(LinkedList<StudentAcc> std1){
        System.out.println("Enter number of student you want to insert: ");
        
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter StudentAcc information %d : \n", i+1);
            System.out.printf("Enter Name %d :\n", i+1);
            String uName = sc.nextLine();
            System.out.printf("Enter classCode %d :\n", i+1);
            String classCode = sc.nextLine();
            System.out.printf("Enter birthYear %d :\n", i+1);
            Short birthYear = Short.parseShort(sc.nextLine());
            StudentAcc x = new StudentAcc(uName, classCode , birthYear);
            std1.addLast(x);
        }
    }
    public static void main(String[] args) {
        LinkedList<StudentAcc> sdt1 = new SinglyLinkedList<>();
        //Insert a list of studentAcc
        MainForStudentAcc.insert(sdt1);
        //Traverse
        sdt1.traverse();
        //find who was born ìn 2000
        System.out.print("Enter: ");
        Short year = Short.parseShort(sc.nextLine());
        MainForStudentAcc.findByYear(sdt1,year);
        //remove first

        //Traverse = check size

        // remove lass

        //Traverse = check size

        //remove from a to b (a,b <n)

    }
}
