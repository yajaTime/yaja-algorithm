import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = 0;
		int N = Integer.parseInt(br.readLine());

		String[] input = new String[N];
		HashMap<Character, Integer> alpha = new HashMap<Character, Integer>();

		for (int i=0; i<N; i++) {
			input[i] = br.readLine();

			// 문자 - 숫자 매핑을 위해 HashMap 사용
			for (int j=0; j<input[i].length(); j++) {
				// 주어진 자릿수의 값 (가중치)
				int weight = (int) Math.pow(10, input[i].length() - (j + 1));
				
				// 알파벳으로 키를 조회하여 존재하는 경우 가중치 합산
				if (alpha.containsKey(input[i].charAt(j))) {
					alpha.put(input[i].charAt(j), alpha.get(input[i].charAt(j)) + weight);
				} else { // 존재하지 않는 경우 insert
					alpha.put(input[i].charAt(j), weight);
				}
			}
		}

		// 가중치 기준으로 내림차순으로 정렬
		List<Character> keySetList = new ArrayList<>(alpha.keySet());
		Collections.sort(keySetList, (o1, o2) -> (alpha.get(o2).compareTo(alpha.get(o1))));

		int num = 9;

		// 가중치가 가장 높은 알파벳부터 높은 숫자를 순차적으로 부여
		for (Character k : keySetList) {
			result += alpha.get(k) * num--;
		}
		
		System.out.println(result);
    }
}