import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = Integer.parseInt(sc.next());
            arr[i][1] = Integer.parseInt(sc.next());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] t1, int[] t2) {
                if(t1[0] == t2[0]) {
                    return t1[1] - t2[1];
                }
                return t1[0] - t2[0];
            }
        });

        int last = arr[0][1];
        int cnt = 1;
        for(int j = 1; j < n; j++) {
            if(arr[j][1] < last) {
                last = arr[j][1];
                continue;
            }

            if(last <= arr[j][0]) {
                cnt++;
                last = arr[j][1];
            }
        }

        System.out.println(cnt);
    }
}

