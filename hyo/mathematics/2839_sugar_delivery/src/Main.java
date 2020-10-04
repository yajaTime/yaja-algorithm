import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(Sugar_delivery(n));
    }

    /*
        n : 상근이가 배달해야 하는 설탕 무게 (kg)
    */
    public static int Sugar_delivery(int n) {
        int x = 3; // 3kg 봉지 개수
        int y = 5; // 5kg 봉지 개수

        for (int i=n/y; i>=0; i--) {
            if ((n - (i * y)) % x == 0) {
                return i + ((n - (i * y)) / x);
            }
        }

        return -1;
    }
}