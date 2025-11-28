package Final.Nov14th;

public class thisClass {
    public static void main(String[] args) {
        A4 a =new A4("박자바",88);
        System.out.printf("생성자 실행, %s %d\n",    a.name,a.price);
        A4 b =new A4();
        System.out.printf("this 생성자실행, %s %d\n", b.name,b.price);
    }
}

class A4 {
    String name;
    int price;
    A4(String name, int price) { // 입력변수가 String, int인 생성자
        this.name = name;
        this.price = price;
    }

    A4() { // 입력변수가 없는 생성자
        this("이름 없음", 77);
    }
}
