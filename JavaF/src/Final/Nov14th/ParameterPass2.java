package Final.Nov14th;

public class ParameterPass2{
    public static void main(String[] args){
        int[][] a={{1,2},{4,5}};
        System.out.print("Main 배열초기값\n");
        ForFunc(a, false);
        b(a);
        System.out.print("\nMain 배열값,함수실행후\n");
        ForFunc(a, false);
    }

    public static void b(int[][] c) {
        System.out.print("\n함수에 전달받은 parameter값\n");
        ForFunc(c, false);
        ForFunc(c, true);
        System.out.print("\n함수에서 1더한 값\n");
        ForFunc(c, false);
    }

    public static void ForFunc(int[][] arr, boolean flag){

        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr.length; j++) {
                if (flag) {
                    arr[i][j]++;
                } else {
                    System.out.printf("[%d][%d]=%d", i, j, arr[i][j]);
                }
            }
    }
}
