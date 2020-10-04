import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String args[]) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            arr[i][0] = Integer.parseInt(line.split(" ")[0]);
            arr[i][1] = Integer.parseInt(line.split(" ")[1]);
        }

        // 종료 시간을 기준으로 먼저 정렬 후, 같을 경우에는 시작 시간을 기준으로 정렬
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }

        });

        int end_time = 0; // 종료 시간
        int cnt = 0; // 횟수

        for (int i = 0; i < n; i++) {
            // 종료 시간 업데이트 후 횟수 증가
            if (arr[i][0] >= end_time) {
                end_time = arr[i][1];
                cnt++;
            }
        }

        // 결과 출력
        System.out.println(cnt);

    }

}