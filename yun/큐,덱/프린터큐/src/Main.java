import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Queue<sub> queue = new LinkedList<>();
        // 우선순위 큐
        PriorityQueue<sub> priorityQueue = new PriorityQueue<>(new Comparator<sub>() {

            @Override
            public int compare(sub o1, sub o2) {
                return (o1.importance-o2.importance) * -1;
            }
        });

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<N;j++) {
                int val = Integer.parseInt(st.nextToken());
                queue.offer(new sub(j,val));
                priorityQueue.offer(new sub(j,val));
            }

            int cnt=0;
            while(true) {

                if(queue.peek().importance==priorityQueue.peek().importance) {
                    if(queue.peek().index==M) break;
                    else {
                        cnt++;
                        queue.poll();
                        priorityQueue.poll();
                    }
                }
                else {
                    queue.offer(queue.poll());
                }
            }
            queue.clear();
            priorityQueue.clear();
            sb.append((cnt+1)+"\n");
        }
        System.out.println(sb.toString());

    }

    static class sub{
        int index, importance;

        public sub(int index, int importance) {
            this.index = index;
            this.importance = importance;
        }

    }
}

