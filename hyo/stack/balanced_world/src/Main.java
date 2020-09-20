import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String msg = "";

        while (true) {
            msg = in.nextLine();

            if (msg.equals(".")) {
                break;
            }

            if (isBalancedBracket(msg) == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        in.close();
    }

    public static Boolean isBalancedBracket(String str) {
        Stack<String> st = new Stack<>();

        String strArr[];

        Boolean result = true;

        // 한 글자씩 배열에 담기
        strArr = str.split("");

        for (int i=0; i<strArr.length; i++) {
            // 여는 괄호일 경우 stack push
            if (strArr[i].equals("(") || strArr[i].equals("[")) {
                st.push(strArr[i]);
            }
            
            // 닫는 소괄호일 경우 stack pop
            if (strArr[i].equals(")")) {
                // 이전에 여는 소괄호가 없거나 마지막으로 넣은 괄호가 대괄호인 경우
                if (st.isEmpty() || st.pop().equals("[")) {
                    result = false;
                    break;
                }
            }

            // 닫는 대괄호일 경우 stack pop
            if (strArr[i].equals("]")) {
                // 이전에 여는 대괄호가 없거나 마지막으로 넣은 괄호가 소괄호인 경우
                if (st.isEmpty() || st.pop().equals("(")) {
                    result = false;
                    break;
                }
            }
        }

        // 마지막으로 괄호가 균형적으로 이루어져 있고, 스택에 여는 괄호가 비어있는 경우 true 리턴
        if (result == true && st.isEmpty()) {
            return true;
        } else { // 마지막으로 괄호가 균형적으로 이루어져 있지 않거나 스택에 여는 괄호가 비어있지 않은 경우 false 리턴
            return false;
        }
    }
}