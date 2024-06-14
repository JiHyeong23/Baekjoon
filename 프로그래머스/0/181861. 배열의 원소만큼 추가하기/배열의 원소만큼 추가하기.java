import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int len = Arrays.stream(arr).sum();
        int[] answer = new int[len];
        int idx = 0;
        for(int i : arr) {
            for (int j = i; j > 0; j--) {
                answer[idx] = i;
                idx++;
            }
        }
        
        return answer;
    }
}