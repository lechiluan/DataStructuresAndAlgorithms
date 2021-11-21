package Java.core;

import java.util.Random;

public class Dice {
    private int sides; // Khong de nguoi khac thay doi code.
    //Overload Dice and Dice(int sides) Ghi de

    public void changeSide(int sides){
        this.sides = sides;
    }
    public Dice(){

    }

    public Dice(int sides){
        this.sides = 6;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides; // this la doi tuong Dice no la bien siles
    }

    public int roll(){
        Random rnd = new Random();
        int result = rnd.nextInt(this.sides)+1;
        return result;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "sides=" + sides +
                '}';
    }
}
