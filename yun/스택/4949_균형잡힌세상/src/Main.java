import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> answerList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String input = reader.readLine();

            if(".".equals(input)) {
                break;
            }

            answerList.add(input);
        }

        reader.close();


        for(String item : answerList) {
            Stack<Character> stack = new Stack<>();

            for(int i=0; i<item.length(); i++) {
                if('(' == item.charAt(i) || '[' == item.charAt(i)) {
                    stack.push(item.charAt(i));
                }
                else if(')' == item.charAt(i)) {
                    if(stack.isEmpty() || stack.pop() != '(') {
                        System.out.println("no");
                        break;
                    }
                }
                else if(']' == item.charAt(i)) {
                    if(stack.isEmpty() || stack.pop() != '[') {
                        System.out.println("no");
                        break;
                    }
                }

                if(i == item.length()-1 && !stack.isEmpty()) {
                    System.out.println("no");

                } else if(i == item.length()-1 && stack.isEmpty()){
                    System.out.println("yes");
                }
            }
        }
    }
}
