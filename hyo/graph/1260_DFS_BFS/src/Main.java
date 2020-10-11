import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 정점의 개수 N
        int m = in.nextInt(); // 간선의 개수 M
        int v = in.nextInt(); // 탐색을 시작할 정점의 번호 V

        // 정점의 개수만큼 배열을 만든 후
        ArrayList<Integer>[] list = new ArrayList[n + 1];

        // 정점을 저장하는 리스트 생성
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<Integer>();
        }

        // 간선의 개수만큼 연결 상태를 입력받기
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            list[x].add(y);
            list[y].add(x);
        }

        // 오름차순으로 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(list[i]);
        }

        boolean[] check = new boolean[n + 1];

        dfs(list, check, v);
        
        System.out.println();

        check = new boolean[n + 1];

        bfs(list, check, v);

        in.close();
    }

    // dfs
    // 재귀 함수로 구현
    public static void dfs(ArrayList<Integer>[] list, boolean[] check, int v) {
        if (check[v]) {
            return;
        }

        // check[v] 노드를 방문했다고 가정
        check[v] = true;

        System.out.print(v + " ");

        // list[i] 의 인접한 모든 수들을 가져와서 방문 여부 확인
        for (int i : list[v]) {
            if (!check[i]) {
                dfs(list, check, i);
            }
        }
    }

    // bfs
    // queue 로 구현
    public static void bfs(ArrayList<Integer>[] list, boolean[] check, int v) {
        Queue<Integer> q = new LinkedList<Integer>();

        // q 에 시작 정점 v add
        q.add(v);

        check[v] = true;

        // q 가 비어있지 않은 경우 맨 앞에 있는 수 x 제거 후 출력 (큐는 선입선출)
        while (!q.isEmpty()) {
            int x = q.remove();

            System.out.print(x + " ");

            // 출력된 x 가 갖고 있는 값 list[x] 조회
            for (int y : list[x]) {
                // check[y] 가 false 인 경우 true 로 변경 후 그 값을 queue 에 add
                if (!check[y]) {
                    check[y] = true;
                    q.add(y);
                }
            }
        }
    }
}