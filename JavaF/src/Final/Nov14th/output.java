package Final.Nov14th;

import java.io.File;

public class output {
    public static void main(String[] args) {
        aaa a = new aaa("박자바", "001-007", 888);
        aaa b = new aaa("김운영", "002=008", 777);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}

class aaa{
    private final String username;
    private final String number;
    private int amount;
    public aaa(String username, String number, int amount) {
        this.username = username; this.number = number; this.amount = amount;
    }
    public String toString() {
        return String.format("%s, %s, %d", username, number, amount);
    }
}
