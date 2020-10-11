import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = 1;

        for(int i = 0; i < 1000000000; i++) {
            n2 += 6 * i;
            if(n <= n2) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
