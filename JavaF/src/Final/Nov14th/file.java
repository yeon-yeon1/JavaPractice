// file 생성/삭제
// file monitor 출력
// file에 출력
// file에서 입력


// file에서 어떤 내용을 읽어들이고 (keyboard 입력) -> 프로그래밍 -> 모니터의 file의 출력
// 1. stream 연결 (객체 생성) 2. Input/Output 진행 3. stream close
// 파일에 저장할 때 int 형식으로 저장함. 그래서 나중에 데이터 읽을 때 int로 읽어와서 문자로 변환시켜 출력해야 함.
package Final.Nov14th;
import java.io.File;
public class file {
    public static void main(String[] args) {
        // "C:aaa.txt" 는 “현재 실행되는 디렉토리 기준 상대경로”로 처리
        //  진짜로 파일명이 "C:aaa.txt" 임
        File aaa= new File("C:aaa.txt");

        try {
            if (aaa.exists()==false) {aaa.createNewFile();
                System.out.println(" file aaa가 성공적으로 생성되었읍니다 ");}
        }

        catch(Exception ex) {System.out.printf("예외발생");}
    }
}


