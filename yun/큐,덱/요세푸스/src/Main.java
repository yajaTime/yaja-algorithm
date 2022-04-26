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

        String[] KN = reader.readLine().split(" ");
        int N = Integer.parseInt(KN[0]);
        int K = Integer.parseInt(KN[1]);

        for(int i=0; i<N; i++) {
            queue.add(i+1);
        }

        sb.append("<");

        while(queue.size() > 0) {
            for(int i=0; i<K-1; i++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll());
            if(queue.size() > 0) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb);

    }
}
