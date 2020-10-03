import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        reader.close();

        String[] arr = input.split("-");

        int answer = 0;

        for(int i=0; i<arr.length; i++) {
            String[] plus = arr[i].split("\\+");
            int result = 0;

            for(int j=0; j<plus.length; j++) {
                result += Integer.parseInt(plus[j]);
            }

            if(i==0) {
                result *= -1;
            }
            answer -= result;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(answer));
        bw.newLine();
        bw.flush();
        bw.close();

    }
}
