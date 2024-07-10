import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (String str : intStrs) {
            int five = Integer.parseInt(str.substring(s, s+l));
            System.out.println(five);
            if (five > k) {
                list.add(five);
            }
        }
        int[] answer = list.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
        return answer;
    }
}