import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,1,2,3};

        System.out.println(solution.solution(nums));

    }

    static class Solution {
        public int solution(int[] nums) {
            int numSize = nums.length;

            Map hash = new HashMap<Integer, Integer>();
            for (int data: nums
            ) {
                hash.put(data, 1);
            }

            int hashSize = hash.size();

            if(numSize/2 < hashSize) {
                return numSize/2;
            }

            return hashSize;

        }
    }
}
