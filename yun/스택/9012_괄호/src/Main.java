import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String args[]) throws IOException {
        List<String> answerList = new ArrayList<>();
        List<String> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        for(int i=0; i<num; i++) {
            String input = reader.readLine();

            answerList.add(input);
        }

        reader.close();

        for (String item : answerList) {
            Stack<Character> stack = new Stack<>();
            boolean check = true;

            for(int i=0; i<item.length(); i++) {
                if(item.charAt(i) == '(') {
                    stack.push(item.charAt(i));
                } else if(item.charAt(i) == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') {
                        result.add("NO");
                        break;
                    }
                }

                if(i == item.length()-1 && !stack.isEmpty()) {
                    result.add("NO");

                } else if(i == item.length()-1 && stack.isEmpty()){
                    result.add("YES");
                }
            }
        }

        for (String s : result) {
            System.out.println(s);
        }

    }
}
