import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        String[] arr = reader.readLine().split(" ");
        int[] P = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(P);

        int minTime = 0;

        for(int i=0; i<P.length; i++) {
            for(int j=0; j<=i; j++) {
                minTime += P[j];
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(minTime));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
