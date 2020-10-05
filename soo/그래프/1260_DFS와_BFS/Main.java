import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int n, m, v;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        Graph graph = new Graph(n);

        for(int i = 0; i < m; i++) {
            String[] arr = br.readLine().split(" ");
            graph.put(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        }

        graph.dfs(v);
        graph.clearVisitHistory();
        System.out.println();
        graph.bfs(v);
    }

    static class Graph {
        int n;
        int[][] graph;
        int[] visit;

        public Graph(int n) {
            this.n = n;
            this.graph = new int[n+1][n+1];
            this.visit = new int[n+1];
        }

        public void put(int x, int y) {
            this.graph[x][y] = 1;
            this.graph[y][x] = 1;
        }

        public void clearVisitHistory() {
            Arrays.fill(visit, 0);
        }

        public void dfs(int v) {
            System.out.print(v + " ");
            this.visit[v] = 1;
            for(int i = 1; i <= this.n; i++) {
                if(this.graph[v][i] == 1 && this.visit[i] == 0) {
                    dfs(i);
                }
            }
        }

        public void bfs(int v) {
            Queue<Integer> q = new LinkedList<Integer>();
            q.add(v);
            this.visit[v] = 1;

            while(!q.isEmpty()) {
                v = q.poll();
                System.out.print(v + " ");

                for(int i = 1; i <= this.n; i++) {
                    if(this.graph[v][i] == 1 && this.visit[i] == 0) {
                        q.add(i);
                        visit[i] = 1;
                    }
                }
            }
        }
    }
}
