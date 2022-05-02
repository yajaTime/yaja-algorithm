import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        int num =0;

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if(cmd.equals("push_back")) {
                num = Integer.parseInt(st.nextToken());
                dq.addLast(num);
            }
            else if(cmd.equals("push_front")) {
                num = Integer.parseInt(st.nextToken());
                dq.addFirst(num);
            }
            else if(cmd.equals("pop_front")){
                if(dq.isEmpty()) {
                    sb.append(-1+"\n");
                    continue;
                }
                sb.append(dq.removeFirst()+"\n");
            }
            else if(cmd.equals("pop_back")) {
                if(dq.isEmpty()) {
                    sb.append(-1+"\n");
                    continue;
                }
                sb.append(dq.removeLast()+"\n");
            }
            else if(cmd.equals("size")) {
                sb.append(dq.size()+"\n");
            }
            else if(cmd.equals("empty")) {
                if(dq.isEmpty()) {
                    sb.append(1+"\n");
                }
                else {
                    sb.append(0+"\n");
                }
            }
            else if(cmd.equals("front")) {
                if(dq.isEmpty()) {
                    sb.append(-1+"\n");
                    continue;
                }
                sb.append(dq.getFirst()+"\n");
            }
            else if(cmd.equals("back")) {
                if(dq.isEmpty()) {
                    sb.append(-1+"\n");
                    continue;
                }
                sb.append(dq.getLast()+"\n");
            }
        }

        System.out.println(sb);
    }
}
