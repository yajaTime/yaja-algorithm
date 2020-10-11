import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); 
       
        System.out.println(getMinCntRoomPassed(n));
        
        in.close();
    }

    // 1층 - 1
    // 2층 - 2 ~ 7
    // 3층 - 8 ~ 19 (8 = 2 + (6 * 1))
    // 4층 - 20 ~ 37 (20 = 8 + (6 * 2))
    // 5층 - 38 ~ 61 (38 = 20 + (6 * 3))
    //  :
    public static int getMinCntRoomPassed(int num) {
        int tmp = 2; // 층별 시작 숫자
        int cnt = 1; // 층

        while (tmp <= num) {
            tmp += 6 * (cnt++);
        }

        return cnt;
    }
}