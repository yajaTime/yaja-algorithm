import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String args[]) throws IOException {
        Stack<Integer> zero = new Stack<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        for(int i=0; i<num; i++) {
            String input = reader.readLine();
            if(Integer.parseInt(input) == 0) {
                zero.pop();
                continue;
            }
            zero.push(Integer.parseInt(input));
        }
        reader.close();
        int[] arr = zero.stream().mapToInt(x->x).toArray();

        int sum = Arrays.stream(arr).sum();

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(Integer.toString(sum));
        writer.flush();
        writer.close();
    }
}
