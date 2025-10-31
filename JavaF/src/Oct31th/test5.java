// 객체 배열 = 객체의 ‘참조(주소)’를 담는 배열
// ① 먼저 “주소를 담을 공간(배열)”을 만들고,
// ② 그다음 각 칸에 실제 객체를 생성해서 “주소를 할당”

//package Oct31th;
//
//public class test5 {
//    String aa; int bb;
//    void cc(){
//        System.out.printf("객체 Array \n");
//    }
//
//    public static void main(String[] args) {
        //   ① 먼저 “주소를 담을 공간(배열)”을 만들고,
//        test5[] arr =new test5[3];
        //   ② 그다음 각 칸에 실제 객체를 생성해서 “주소를 할당”
//        arr[0] = new test5();
//        arr[1] = new test5();
//        arr[2] = new test5();
//
//        for(int i=0;i<3;i++) {
//            arr[i].aa="AAA";
//            arr[i].bb=i;
//        }
//
//        for(int i=0;i<3;i++) {
//            System.out.printf("Array arr[%d].aa=%s,arr[%d].bb=%d\n",i,arr[i].aa,i,arr[i].bb);
//        }
//    }
//}

// 객체 생성 포문으로 돌려서 넣기

package Oct31th;

public class test5 {
    String aa; int bb;
    void cc(){
        System.out.printf("객체 Array \n");
    }

    public static void main(String[] args) {
        test5[] arr = new test5[3];

        for(int i=0; i < arr.length; i++){
            arr[i] = new test5();
        }

        for(int i=0;i<3;i++) {
            arr[i].aa="AAA";
            arr[i].bb=i;
        }
        for(int i=0;i<3;i++) {
            System.out.printf("Array arr[%d].aa=%s,arr[%d].bb=%d\n",i,arr[i].aa,i,arr[i].bb);
        }
    }
}



