package Java.core;

import java.util.Scanner;

public class Fib {
    //T(x)=O(2^n)
    //S(x)=O(n)

    static int FibR(int N){
        if(N<=1){
            return N;
        }
        return FibR(N-2)+FibR(N-1);
    }

    //O(n)
    //O(n)

    static int FibI(int N){
        int[] a=new int[N+2];
        int b=0,c=1;
        a[0]=b;
        a[1]=c;
        for(int i=2;i<=N;i++){
            int sum=b+c;
            b=c;
            c=sum;
            a[i]=sum;
        }
        return a[N];
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter size: ");
        int n=Integer.parseInt(sc.nextLine());
        int result=Fib.FibR(n);
        System.out.print("The result: "+result);
    }
}
