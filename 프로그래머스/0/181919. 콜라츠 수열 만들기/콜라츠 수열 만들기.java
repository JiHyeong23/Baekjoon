import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> li = new ArrayList<>();
        li.add(n);
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
                li.add(n);
            } else {
                n = (3 * n +1);
                li.add(n);
            }
        }
        int[] answer = new int[li.size()];
        int idx = 0;
        for (int i : li) {
            answer[idx] = i;
            idx++;
        }
        return answer;
    }
}