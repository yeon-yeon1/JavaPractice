// 클래스 상속
// class 상속은 다른 class에 정의된 instance(field, method) 사용 가능 하게 하는 기법

// 부모 클래스에서 자식 클래스로 상속 가능 but 자식 클래스에서 부모 클래스 상속 불가능
// -> 자식 클래스에 있는 인스턴스 부모 클래스가 사용 X

// 자식 클래스 객체 생성하게 되면 부모 클래스 객체는 자동으로 생성됨 (자식 클래스보다 먼저 생성됨)

// 메모리 효율적 사용 가능, 코드 길이 짧음, 오류 수정이 쉬움, 유지보수 효율적, 시스템 upgrade가 효울적
// 다중 상속불가, 인터페이스로 가능
// 여러 부모 클래스에서 상속 불가, 하나의 부모 클래스에서만 상속 가능 (다이아몬드 형성되면 안됨)
package Oct31th;

public class test6 {
    public static void main(String[] args) {
        b k = new b();
        k.i=77;
        k.j=88;

        k.pr();
        k.pri();
    }
}

class a {
    int i, j;
    void pr() {
        System.out.printf(" class a의 i=%d j=%d\n", i,j);
    }
}

class b extends a {
    int aa;
    void pri() {
        aa=i;
        System.out.printf(" class a의 i=%d class b의 aa=%d\n", i,aa);
    }
}



