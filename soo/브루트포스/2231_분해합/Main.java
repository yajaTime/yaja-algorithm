import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        int min = n - 9 * String.valueOf(n).length();

        for(int i = min; i < n; i++) {
            int h = i;
            String j = String.valueOf(i);

            for(int k = 0; k < j.length(); k++) {
                h += Character.getNumericValue(j.charAt(k));
            }

            if(h == n) {
                m = i;
                break;
            }
        }

        System.out.println(m);
    }
}
