import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]) throws IOException {

        Queue<Integer> queue = new LinkedList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(reader.readLine());

        for(int i=0; i<N; i++) {
            String line = reader.readLine();
            if(line.contains("push")) {
                String[] arr = line.split(" ");
                String cmd = arr[0];
                int value = Integer.parseInt(arr[1]);
                queue.add(value);
            } else if(line.contains("pop")) {
                if(queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.poll() + "\n");
                }
            } else if(line.contains("size")) {
                sb.append(queue.size() + "\n");
            } else if(line.contains("empty")) {
                if(queue.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if(line.contains("front")) {
                if(queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(queue.peek() + "\n");
                }
            } else if(line.contains("back")) {
                if(queue.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(((LinkedList<Integer>) queue).peekLast() + "\n");
                }
            }
        }

        System.out.println(sb);
    }
}
