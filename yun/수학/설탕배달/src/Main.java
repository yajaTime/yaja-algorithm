import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bongi = sc.nextInt();

        System.out.println(foo(bongi));
    }

    public static int foo(int bongi) {
        int num = 0;

        int five_quotient = bongi / 5;
        int five_remainder = bongi % 5;

        if(five_remainder == 0) {
            return five_quotient;
        }

        int three_quotient = 0;
        int three_remainder = 0;

        while(true) {
            three_quotient = (bongi - (5 * five_quotient)) / 3;
            three_remainder = five_remainder % 3;

            if(five_quotient == -1) {
                if(bongi % 3 == 0) {
                    return bongi / 3;
                }
                return -1;
            }
            if((5 * five_quotient) + (3 * three_quotient) == bongi) {
                return five_quotient + three_quotient;
            } else {
                five_quotient = five_quotient - 1;
            }
        }
    }
}
