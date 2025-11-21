package Final.Nov14th;

public class ParameterPassC {
    int a;
    void add(ParameterPassC b){
        b.a++;
    }

    public static void main(String[] args) {
        ParameterPassC b = new ParameterPassC();
        b.a = 1;

        b.add(b);

        System.out.println(b.a);
    }
}

