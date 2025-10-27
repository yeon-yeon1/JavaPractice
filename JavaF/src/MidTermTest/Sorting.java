package MidTermTest;

public class Sorting {
    public static void main(String[] args){
        int[] arr = {4,9,2,6,10,1,8,35,7};
        // 오름차순 정렬 만들기
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        for(int i=0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
    }
}
