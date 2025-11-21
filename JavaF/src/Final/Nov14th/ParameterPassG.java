package Final.Nov14th;

public class ParameterPassG {
    int a;
    void add(ParameterPassG c) {a+=1;}

    public static void main(String[] args) {
        int i=1;

        ParameterPassG c =new ParameterPassG();
        aaaa k =new aaaa();

        k.bb=77;
        c.a=1;

        c.add(k);
        System.out.printf("%d\n",c.a);

        k.aa(k);
        System.out.printf("%d",k.bb);
    }

}

class aaaa extends ParameterPassG {
    int bb;
    void aa(Final.Nov14th.aaaa c) {bb++;}
}
