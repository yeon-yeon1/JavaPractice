// midterm 까지는 class가 그냥 파일명이었음.
// 지금부터는 데이터와 함수를 묶어 정의해놓는 애임
// 메소드 -> 클래스 내 데이터 처리를 위해 존재
// 클래스 내 변수, 값 직접 변경 불가
// 클래스 변수 = 하나의 레퍼런스 = 주소값을 가짐

// 클래스를 만드는 순간 따로 초기화하지 않아도 데이터 타입에 맞게 초기화가 진행됨
// 예시) boolean type -> false, int -> 0, float -> 0.0


package Oct31th; //  project, package 이름

public class test1 { //   class 정의, 프로그래밍 이름
    int a;
    int b;
    String str;          //  field 정의
    public void add(){
        a+=1;
        b+=1;
        System.out.printf("a=%d b=%d 한국의 대학 중에 %s\n",a,b,str);
    }     // method  정의

    public static void main(String[] args){          //   main method
        test1 aaa = new test1();                     //   객체 생성
        aaa.a=7;
        aaa.b=8;
        aaa.str="덕성 최고!";                           //  . 연산자를 객체 field에 초기 값 대입
        aaa.add();                                    //    method call(실행)
    }                                                 //    main method 범위
} //class(test1) 범위

