package Java.core;

public class TestDice {
    public static void main(String[] args) {
        Dice d1 = new Dice(6);
        Dice d2 = new Dice();
        d1.setSides(6);
        d2.setSides(4);
        System.out.println("D1 sides: "+d1.getSides());
        System.out.println("D2 sides: "+d2.getSides());
        System.out.println("Result is "+ d1.roll());
        d1.changeSide(8);
        System.out.println("D1 sides: "+d1.getSides());
    }
}
