import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // 3개의 자연수 입력받기
        int a = in.nextInt(); 
        int b = in.nextInt(); 
        int c = in.nextInt(); 

        // a * b * c 계산한 결과 저장
        int num = a * b * c;

        // 숫자 개수를 담을 배열
        int[] cnt = new int[10];

        while (num > 0) {
            cnt[num % 10]++;
            num /= 10;
        }
        
        for (int i = 0; i < cnt.length; i++) {
            System.out.println(cnt[i]);
        }
        
        in.close();
    }
}