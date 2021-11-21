package Lab;

public class Main {
    public static void A(){
        B();
    }

    private static void B() {
        C();
    }

    private static void C() {
        // do something
    }

    public static void main(String[] args) {
        Main.A();
    }
}


