import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String args[]) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(reader.readLine());
        int start = 0;

        for(int i=0; i<N; i++) {
            String input = reader.readLine();
            int value = Integer.parseInt(input);

            if(value > start) {
                for (int j = start+1; j <= value ; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                start = value;
            } else if(stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-\n");
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(String.valueOf(sb));
        writer.flush();
        writer.close();
    }
}
