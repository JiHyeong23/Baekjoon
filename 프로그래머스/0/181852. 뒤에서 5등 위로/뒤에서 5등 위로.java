import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> li = new ArrayList<>();
        for (int num : num_list) {
            li.add(num);
        }
        li.sort(Integer::compareTo);
        List<Integer> subList = li.subList(5, li.size());
        
        int[] answer = new int[subList.size()];
        for (int i = 0; i < subList.size(); i++) {
            answer[i] = subList.get(i);
        }
        return answer;
    }
}