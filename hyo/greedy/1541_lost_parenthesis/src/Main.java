import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        // 입력받은 문자열을 -를 기준으로 분해하여 배열로 저장
        String[] arr = input.split("\\-");

        // 맨 처음으로 나오는 - 앞의 구간들은 더한 후 최종 결과로 초기화
        int result = getSum(arr[0]);

        // 그 다음으로 나오는 구간들은 더한 후 최종 결과에서 빼기
        for (int i = 1; i < arr.length; i++) {
            result -= getSum(arr[i]);
        }

        System.out.println(result);

        in.close();
    }

    // - 를 기준으로 자른 구간들의 합 구하기
    public static int getSum(String tmp) {
        int sum = 0;

        // 합을 구하기 위해 + 를 기준으로 자른 후
        String[] arr = tmp.split("\\+");

        // 자른 숫자들을 모두 더하기
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        return sum;
    }

}