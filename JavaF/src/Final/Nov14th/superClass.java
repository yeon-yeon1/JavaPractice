package Final.Nov14th;

public class superClass {
    public static void main(String[] args) {
        A5 a = new A5("박자바",77,88);
        A5 b = new A5();
        a.printInfo();
        b.printInfo();
    }
}

abstract class B5 {
    String name;
    int price;

    B5(String name, int price) {
        this.name = name;
        this.price = price;
    }

    B5() {
        this.name = "김운영";
        this.price = 99;
    }
}
class A5 extends B5{
    int power;
    A5(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }

    A5() {
        super();
        this.power = -1;
    }

    void printInfo() {
        System.out.printf("%s %d %d\n",
                super.name, super.price, this.power);
    }
}
