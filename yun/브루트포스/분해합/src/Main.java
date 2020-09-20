import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        reader.close();

        int answer = 0;

        for(int i=0; i<N; i++) {
            int sum=0;
            int num=i;

            while(num != 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }

            if(sum + i == N) {
                answer = i;
                break;
            }
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(answer));
        writer.flush();
        writer.close();

    }
}
