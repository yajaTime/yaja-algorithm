import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 동전의 종류 개수
        int k = in.nextInt(); // 만들어내야 하는 가치 합

        int[] values = new int[n]; // 동전의 가치 배열

        for (int i = 0; i < n; i++) {
            values[i] = in.nextInt();
        }

        System.out.println(getMinCoinCnt(n, k, values));

        in.close();
    }

    // k원 만드는데 필요한 동전 개수의 최솟값 구하기
    public static int getMinCoinCnt(int n, int k, int[] values) {
        int cnt = 0; // k원을 만드는데 필요한 동전 개수의 최솟값

        // 큰 가치의 동전부터
        for (int i = n - 1; i >= 0; i--) {
            if (k >= values[i]) {
                cnt += k / values[i];
                k = k % values[i];
            }

            if (k == 0) {
                break;
            }
        }

        return cnt;
    }

}