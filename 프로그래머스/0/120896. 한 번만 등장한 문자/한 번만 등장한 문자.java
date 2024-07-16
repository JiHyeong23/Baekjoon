import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.merge(s.charAt(i), 1, Integer::sum);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (Character key : map.keySet()) {
            Integer val = map.get(key);
            if (val == 1) {
                answer += key;
            } 
        }
        return answer;
    }
}