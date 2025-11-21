package Final.Nov14th;

public class ParameterPass11_21{
    public static void main(String[] args){
        int[] a = {1,2,3};
        System.out.printf("Main 배열 초기값 ");
        for(int i=0;i<a.length;i++)
            System.out.printf(" a[%d]=%d ",i,a[i]);
        b(a);
        System.out.printf("\nMain 배열값,함수 실행후");

        for(int i=0; i < a.length; i++)
            System.out.printf(" a[%d]=%d ",i,a[i]);
    }

    public static void b(int[] ar) {
        System.out.printf("\n함수에 전달받은 배열값 ");

        for(int i=0; i < ar.length; i++) {
            System.out.printf("ar[%d]=%d ",i,ar[i]);  }

        for(int i=0; i < ar.length; i++) {
            ar[i] +=1;
        }

        System.out.printf("\n함수에서 1증가된 배열값 ");

        for(int i=0; i < ar.length; i++) {
            System.out.printf("ar[%d]=%d ",i,ar[i]);   }
    }
}
