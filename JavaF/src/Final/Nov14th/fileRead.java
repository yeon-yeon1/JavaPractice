package Final.Nov14th;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
public class fileRead {
    public static void main(String[] args)throws IOException,InterruptedException  {

//        FileWriter fw = new FileWriter("bbb.txt", true); // true = 이어쓰기(append)
//        fw.write("신규계좌, 003-009, 999\n");
//        fw.close();

        File file = new File("bbb.txt");
        FileReader fr = new FileReader(file);  //File 읽음 객체 생성
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
            Thread.sleep(200);
        }
        fr.close();

//        BankAccount acc1 = new BankAccount("홍길동", "010-1234", 5000);
//        System.out.println("\nBankAccount test: " + acc1);
    }
}

// 교안에 있는 클래스
//class BankAccount {
//    private final String username;
//    private final String number;
//    private int amount;
//    public BankAccount(String username, String number, int amount) {
//        this.username = username;
//        this.number = number;
//        this.amount = amount;
//    }
//    public String toString() {
//        return String.format("%s, %s, %d", username, number, amount);	}
//}


// 따로 해 본 실습
//public class fileRead {
//    public static void main(String[] args) throws Exception {
//
//        FileWriter fw = new FileWriter("aaa.txt", true); // 이어쓰기
//        fw.write("\nㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ\n");
//        fw.close();
//
//        try (BufferedReader br = new BufferedReader(new FileReader("aaa.txt"))) {
//            String line;
//            int lineNo = 0;
//
//            while ((line = br.readLine()) != null) {
//                lineNo++;
//
//                String[] words = line.split(" ");
//
//                for (String w : words) {
//                    if (w.isEmpty()) continue;
//
//                    for (int i = 0; i < w.length(); i++) {
//                        char ch = w.charAt(i);
//                        long charDelay = getDelayFor(lineNo, w, ch);
//                        System.out.print(ch);
//                        Thread.sleep(charDelay);
//                    }
//
//                    System.out.print(" ");
//                }
//
//                System.out.println(); // 줄바꿈
//            }
//        }
//    }
//
//    private static long getDelayFor(int lineNo, String word, char ch) {
//        if (ch == '.') {
//            return 800;
//        }
//
//        if (lineNo == 1) {
//            return 200;
//        }
//
//        if (word.length() > 10) {
//            return 50;
//        }
//
//        return 300;
//    }
//}