// 메소드 오버로딩

// 같은 이름의 함수 2개 이상 정의 가능, overloading, 다형성 함수중첩
// 실행 할 때 데이터 타입, 데이터 개수로 결정


package Oct31th;

public class test3 {
    int a; int b; int c; String ss;

    test3(int aa, int bb){
        a=aa; b=bb; System.out.printf("method over loading a=%d, b=%d\n",a,b);}

    test3(int aa, int bb, int cc){
        a=aa; b=bb; c=cc;
        System.out.printf("method over loading a=%d, b=%d, c=%d\n",a,b,c);}

    test3(int aa, int bb, String st){
        a=aa; b=bb; ss=st;
        System.out.printf("method over loading a=%d, b=%d, %s\n",a,b,ss);}

    public static void main(String[] args) {
        int i=77; int k=88; int j=55; String str="덕성";
        test3 c = new test3(i,k);
        test3 d = new test3(i,k,j);
        test3 e = new test3(i,k,str);
    }

}
