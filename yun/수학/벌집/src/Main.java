import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        int sum = 1;
        int pin = 6;
        int pin_order = 1;
        int count = 1;

        while(sum < n) {
            count++;
            sum += (pin*pin_order);
            pin_order++;
        }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(count));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
