package MidTermTest;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String input = sc.nextLine();

        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);  // 뒤에서부터 한 글자씩 추가
        }

        System.out.println("뒤집은 문자열: " + reversed);
        sc.close();


    }
}
