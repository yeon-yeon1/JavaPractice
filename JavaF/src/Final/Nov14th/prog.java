package Final.Nov14th;

import java.io.File;
public class prog {
    public static void main(String[] args) {
        File bbb= new File("c:bbb.txt");

        try {
            if (bbb.exists()==false) {
                bbb.createNewFile();
                System.out.println(" file bbb가 성공적으로 생성되었읍니다 ");
            }

            else if (bbb.exists()==true) {
                bbb.delete();
                System.out.println(" bbb파일이 성공적으로 삭제 되었읍니다 ");
            }
        } catch(Exception ex) {
            System.out.printf("예외발생");
        }



        if (bbb.exists()==false) {
            System.out.printf("file bbb는 없는 파일 입니다");
        }
    }
}

