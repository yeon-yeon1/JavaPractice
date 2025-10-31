package Oct31th;

public class test5 {
    String aa; int bb;
    void cc(){
        System.out.printf("객체 Array \n");
    }

    public static void main(String[] args) {
        test5[] arr =new test5[3];
        arr[0] = new test5();
        arr[1] = new test5();
        arr[2] = new test5();

        for(int i=0;i<3;i++) {
            arr[i].aa="AAA";
            arr[i].bb=i;
        }

        for(int i=0;i<3;i++) {
            System.out.printf("Array arr[%d].aa=%s,arr[%d].bb=%d\n",i,arr[i].aa,i,arr[i].bb);
        }
    }
}


