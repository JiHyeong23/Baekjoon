import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int start, int end_num) {
        List<Integer> list = new ArrayList<>();
        for (int i = start; i >= end_num; i--) {
            list.add(i);
        }
        return list;
    }
}