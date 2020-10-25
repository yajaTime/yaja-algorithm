import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		ArrayList<String> strList = new ArrayList<String>();
		Map<Character, Integer> alphabetMap = new HashMap<Character, Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			strList.add(str);

			for(int j = 0; j < str.length(); j++) {
				// 가중치 계산
				int weight = (int)Math.pow(10, str.length() - (j + 1));

				if(alphabetMap.containsKey(str.charAt(j))) {
					alphabetMap.put(str.charAt(j), alphabetMap.get(str.charAt(j)) + weight);
				} else {
					alphabetMap.put(str.charAt(j), weight);
				}
			}
		}

		// 가중치 기준 내림차순 정렬
		List<Character> keyList = new ArrayList<>(alphabetMap.keySet());
		Collections.sort(keyList, (o1, o2) -> (alphabetMap.get(o2).compareTo(alphabetMap.get(o1))));

		int num = 9;
		int answer = 0;
		for(Character key : keyList) {
			answer += alphabetMap.get(key) * num--;
		}

		System.out.println(answer);
	}
}
