import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String str = String.valueOf(a * b * c);
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0 ,0};

        for(int i = 0; i < str.length(); i++) {
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            arr[num] = arr[num] + 1;
        }

        for(int count:arr) {
            System.out.println(count);
        }
    }
}
