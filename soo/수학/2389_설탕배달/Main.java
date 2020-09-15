import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int answer = -1;
        
        int i = n / 5;

        while(i >= 0) {
            int k = n - (5 * i);
                if(k % 3 > 0) {
                    i--;
                } else {
                    answer = i + (k / 3);
                    break;
                }
        }
        
        System.out.println(answer);
    }
}
