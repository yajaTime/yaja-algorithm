import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(getGeneratorNum(n));

        in.close();
    }

    // 생성자 찾는 메소드
    public static int getGeneratorNum(int num) {
        for (int i = 0; i < num; i++) {
            int res = i, tmp = i;

            while (tmp > 0) {
                res += tmp % 10; // 각 자릿수 더하기
                tmp /= 10;
            }

            // 생성자가 존재하는 경우 바로 리턴
            if (res == num) {
                return i;
            }
        }

        return 0;
    }
}