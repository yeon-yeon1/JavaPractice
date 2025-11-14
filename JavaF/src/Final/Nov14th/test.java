package Final.Nov14th;

import java.util.ArrayList;
public class test {
    public static void main(String[] args) {

        try { ArrayList<String> names = null;
            names.add("Park");}

        catch(Exception ex){
            System.out.println(" Exception 발생");}

        finally {System.out.println("예외처리에서 예외 발생과 상관없이 실행됨");
        }
    }
}
