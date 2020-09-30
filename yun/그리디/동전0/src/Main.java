import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        String[] inputArr = input.split(" ");

        int N = Integer.parseInt(inputArr[0]);
        int K = Integer.parseInt(inputArr[1]);

        List<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++) {
            int iA = Integer.parseInt(reader.readLine());
            A.add(iA);
        }
        reader.close();

        int count = 0;
        int num = K;
        for(int i=A.size()-1; i>=0; i--) {
            if(A.get(i) > num) {
                continue;
            }
            count += num / A.get(i);
            num = num % A.get(i);
        }

        System.out.println(count);

    }
}
