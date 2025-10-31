package Oct31th;

public class test4 {
    String aa;
    int bb;

    void cc() {
        System.out.printf("객체 Array \n");
    }

    public static void main(String[] args) {
        test4[] arr = new test4[3];
        arr[0] = new test4();
        arr[1] = new test4();
        arr[2] = new test4();
        arr[0].cc();
        arr[0].aa = "korea";
        arr[0].bb = 77;
        arr[1].bb = 88;
        arr[1].aa = "duksung";
        arr[2].aa = "first!";
        arr[2].bb = 99;
        System.out.printf(" %s %d\n", arr[0].aa, arr[0].bb);
        System.out.printf(" %s %d\n", arr[1].aa, arr[1].bb);
        System.out.printf(" %s %d\n", arr[2].aa, arr[2].bb);
    }
}

