package Final.Nov14th;

public class thisAbstractClass {
    public static void main(String[] args) {
        B2 b = new B2("3분반",38,37);
        C2 c = new C2("4분반",21,20);
        System.out.printf(" 중간고사 %s %d 명 학생 중 %d 명응시\n",b.ban,b.num,b.bb);
        System.out.printf(" 중간고사 %s %d 명 학생 중 %d 명응시\n",c.ban,c.num,c.cc);
    }
}
abstract class A3{
    String ban;
    int num;
}
class B2 extends A3{
    int bb;
    B2(String ban, int num, int bb){
        this.ban=ban; this.num=num;this.bb=bb;}
}
class C2 extends A3{
    int cc;
    C2(String ban, int num, int cc){
        this.ban=ban;
        this.num=num;
        this.cc=cc;}
}
