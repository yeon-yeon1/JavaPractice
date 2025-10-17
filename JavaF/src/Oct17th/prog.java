package Oct17th;

public class prog {
    int a; int b; int c;

    prog(int aa, int bb){
        a = aa; b= bb;
        System.out.printf("함수 over loading a=%d, b=%d\n", a, b);
    }

    prog(int aa, int bb, int cc){
        a=aa; b=bb; c=cc;
        System.out.printf("함수 over load a=%d, b=%d, c=%d\n", a, b, c);
    }
    public static void main(String[] args) {
        int i=77, k=88, j=100;
        prog c = new prog(i, k);
        prog c2 = new prog(i, k, j);
    }
}
