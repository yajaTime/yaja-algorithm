import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int n, k;
        int answer = 0;
        int[] arr;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] <= k) {
                answer += k / arr[i];
                k = k % arr[i];
            }
        }

        System.out.println(answer);
    }
}

