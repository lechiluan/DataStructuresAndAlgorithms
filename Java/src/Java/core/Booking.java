package Java.core;

import java.util.Random;

public class Booking {
    static  Integer[] typeRoom = {2,3,5};
    static Queue<Integer> q = new Queue<>();
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            Integer type = choose(typeRoom);//loai phong khach chon
            System.out.printf("#%d book type %d\n", i,type);
            if(q.find(type)<typeRoom[type]){
                q.offer(type);
            }
            else {
                System.out.println("No room for you");
            }
            q.traverse();
        }
    }
    public static  Integer choose(Integer[] typeRoom){
        Random rn = new Random();
        Integer i = new Integer(rn.nextInt(typeRoom.length));
        return i;
    }
}
