package Final.Nov14th;

public class protectedSuper {
    public static void main(String[] args) {
        B8 a = new B8("박자바", 77, 88);
        B8 b = new B8();
        a.printInfo();
        b.printInfo();
    }
}
abstract class A8{
    protected String name;
    protected int price;
    protected A8(String name, int price) {
        this.name = name;
        this.price = price; }
    public A8() {
        this.name = "이름 없음";
        this.price = -1; }
    public String getName() {
        return name; }

    public int getPrice() {
        return price;
    }
}
class B8 extends A8 {
    private int power;
    B8(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }
    B8() {
        super();
        this.power = -1; }
    void printInfo() {
        System.out.printf("%s %d %d\n",
                super.name, super.price, this.power);
    }
}
