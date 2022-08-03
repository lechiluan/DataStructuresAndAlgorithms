package Java.core;

import java.util.Arrays;

// Apply of Stack

public class CheckBalance {
    public static Character[] begin = {'(','{','[',};

    public static boolean check(String expr) {
        Stack<Character> sBegin = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            Character x = expr.charAt(i);
            if (Arrays.asList(begin).contains((x))) {
                sBegin.push(x);
                continue;
            }
            //n line
            if(sBegin.isEmpty())
            {
                return false;
            }
            int diff = x.hashCode() - sBegin.peek().hashCode();
            if (diff > 2 || diff < 0) {
                return false;
            } else {
                sBegin.pop(); // Loai bỏ 2 dấu giống nhau
            }
        }
        if(!sBegin.isEmpty())
            return false;
        return true;
    }
    public static void main(String[] args) {
        String  expr = "[]()()";

        if(check(expr)){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
}
}
