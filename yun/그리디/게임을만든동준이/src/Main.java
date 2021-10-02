import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] level = new int[n];

        for(int i = 0; i < n; i++) {
            int score = Integer.valueOf(br.readLine());
            level[i] = score;
        }

        int count = 0;

        if(n > 1) {
            for(int i = n - 2; i >= 0; i--) {
                int highLevel = level[i + 1];
                int lowLevel = level[i];

                if(lowLevel >= highLevel) {
                    count += lowLevel - (highLevel - 1);
                    level[i] = highLevel - 1;
                }
            }

        }

        System.out.println(count);

    }
}
