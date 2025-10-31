// 생성자(함수)를 통해 값을 전달해보자.

// (생성자 이름 = class 이름) 해야 됨 => 생성자 함수
// 클래스를 생성할 때 초기값을 전달해주고 자연스럽게 호출돼서 실행이 되는 함수 => 생성하는 객체에 초기 값을 전달
// 여러 개의 생성자 정의 가능

package Oct31th;

public class test2 {

    int a; int b; int c=99; String str;

//  오버 로딩
    // 함수 사용 기준 -> 전달받는 매개변수 기준으로 선택

    test2(int aa, int bb, String st){ //생성자(constructor)
        a=aa; b=bb; str=st;a+=1;b+=1;
        System.out.printf("a=%d b=%d c=%d 한국의 대학 중에 %s\n",a,b,c,str);}

    test2(int kk){a=kk;a=a+10;System.out.printf("a=%d",a);} //생성자(constructor)


    public static void main(String[] args) {
        test2 c = new test2(77,88,"덕성 최고!");
        test2 d = new test2(55);
    }


}
