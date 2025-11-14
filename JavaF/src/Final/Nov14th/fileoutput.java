package Final.Nov14th;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileoutput {
    public static void main(String[] args) throws IOException {
        A a = new A("박자바", "001-007", 777);
        A b = new A("김운영", "002-008", 888);
        File fi = new File("bbb.txt");                     // File 객체 생성
        fi.createNewFile();
        FileWriter fw = new FileWriter(fi);            //FileWrite 객체 샐성
        fw.write(a.toString() + "\n");
        fw.write(b.toString() + "\n");
        fw.close();
        System.out.printf("파일에 출력성공!");		    }
}
class A {
    private final String username;
    private final String number;
    private int amount;
    public A(String username, String number, int amount) {
        this.username = username;
        this.number = number;
        this.amount = amount;
    }
    public String toString() {
        return String.format("%s, %s, %d", username, number, amount);		    }
}
