import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i]*2; j++) {
                    lst.add(arr[i]);
                }
            } else {
                for (int k = 0; k < arr[i]; k++) {
                    lst.remove(lst.size()-1);
                }
            }
        }
        int[] answer = lst.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}