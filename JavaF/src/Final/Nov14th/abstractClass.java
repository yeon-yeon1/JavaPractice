package Final.Nov14th;

public class abstractClass {
    public static void main(String[] args) {
        B b = new B("3분반",38,37);
        C c = new C("4분반",21,20);
        System.out.printf(" 중간고사 %s %d 명 학생 중 %d 명응시\n",b.ban,b.num,b.bb);
        System.out.printf(" 중간고사 %s %d 명 학생 중 %d 명응시\n",c.ban,c.num,c.cc);
    }
}
abstract class A2{
    String ban;
    int num;
}
class B extends A2{
    int bb;
    B(String ba, int nu, int bbb){
        ban=ba;
        num=nu;
        bb=bbb;}
}
class C extends A2{
    int cc;
    C(String ca, int numb, int ccc){
        ban=ca;
        num=numb;
        cc=ccc;}
}
