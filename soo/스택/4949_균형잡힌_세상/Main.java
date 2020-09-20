import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while(true) {
                String str = br.readLine();
                if(str.equals(".")) {
                    break;
                }

                Stack<Character> st = new Stack();
                boolean result = true;
                for(int i = 0; i < str.length(); i++) {
                    char a = str.charAt(i);

                    if(a == '[' || a == '(') {
                        st.push(a);
                    } else if(a == ')') {
                        if(st.empty() || st.peek() != '(') {
                            result = false;
                            break;
                        } else {
                            st.pop();
                        }
                    } else if(a == ']') {
                        if (st.empty() || st.peek() != '[') {
                            result = false;
                            break;
                        } else {
                            st.pop();
                        }
                    }
                }
                if(result && st.empty()) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

