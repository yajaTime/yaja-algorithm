import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 레벨의 개수
        int[] score = new int[n]; // 각 레벨의 점수
        int cnt = 0; // 점수 감소시켜야 하는 최소의 횟수

        // 점수 입력받기
        for (int i=0; i<n; i++) {
            score[i] = sc.nextInt();
        }

        // 높은 레벨부터 비교
        for (int i=n-2; i>=0; i--) {
            if (score[i] >= score[i + 1]) {
                cnt += (score[i] - (score[i + 1] - 1));
                score[i] = score[i + 1] - 1;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}