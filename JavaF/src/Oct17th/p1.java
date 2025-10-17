package Oct17th;

public class p1 {
    public static void main(String[] args) {
        int[] runningMinutes = {42, 66, 57, 54, 88, 64, 71};
        int sum = 0;

        for(int i = 0; i < runningMinutes.length; i++) {
            sum += runningMinutes[i];
        }

        double average = (double) sum / runningMinutes.length;
        System.out.printf("총합: %d분\n", sum);

        double ttt= sum/7 ;

        // %.15f -> 소숫점 아래 15자리까지 인쇄
        System.out.printf("ttt=%.15f",ttt);
        // ~분 ~초로 인쇄하기
        // 소숫점 이하 자리만 가져가고 싶을 때 -> (average % 1)
        System.out.printf("평균: %d분 %.0f초\n", (int) average, 60 * (average % 1));

        // 소숫점 이하 자리만 찍어보기
        // 소수점이 있는 수일 때
        System.out.printf(" 실수 경우 %f \n",(23.22 % 1));
        // 소수점이 없는 수일 때
        System.out.printf(" 정수 경우 %d \n",(23 % 1));
    }
}
