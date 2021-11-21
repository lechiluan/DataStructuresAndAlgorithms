package Sort;

public class BubbleSort {
    public static void sort1(int[] a,int n){
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println("Step "+i);
            for (int obj:a){
                System.out.printf("%d",obj);
            }
        }
    }
    public static void sort2(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j >= i + 1; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println("Step " + i);
            for (int obj : a) {
                System.out.printf("%d ", obj);
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {5,1,4,2,8};
        BubbleSort.sort1(a, a.length);

    }
}
