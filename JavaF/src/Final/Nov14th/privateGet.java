package Final.Nov14th;

public class privateGet {
    public static void main(String[] args) {
        B7 a = new B7("박자바", 77, 88);
        B7 b = new B7();
        a.printInfo();
        b.printInfo();
    }
}
abstract class A7{
    private String name;
    private int price;
    public A7(String name, int price) {
        this.name = name;
        this.price = price; }
    public A7() {
        this.name = "이름 없음";
        this.price = -1; }

    public String getName() {
        return name; }

    public int getPrice() {
        return price;
    }
}
class B7 extends A7 {
    private int power;
    B7(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }
    B7() {
        super();
        this.power = -1; }
    void printInfo() {
        System.out.printf("%s %d %d\n",
                super.getName(), super.getPrice(), this.power);
    }
}
