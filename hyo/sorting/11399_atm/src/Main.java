import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt(); // 사람 수
        int[] per_time = new int[cnt]; // 각 사람이 돈을 인출하는데 걸리는 시간 Pi

        for (int i = 0; i < cnt; i++) {
            per_time[i] = in.nextInt();
        }

        System.out.println(getMinimumSum(cnt, per_time));

        in.close();
    }

    // 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값 구하기
    public static int getMinimumSum(int cnt, int[] time) {
        int sum = 0;

        // 오름차순으로 정렬
        Arrays.sort(time);

        for (int i = 0; i < cnt; i++) {
            sum += time[i] * (cnt - i);
        }

        return sum;
    }

}