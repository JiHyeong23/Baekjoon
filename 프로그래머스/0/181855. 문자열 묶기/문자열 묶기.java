import java.util.*;
import java.util.Map.Entry;

class Solution {
    public int solution(String[] strArr) {
        int answer = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (String str : strArr) {
            int len = str.length();
            if (map.containsKey(len)) {
                int value = map.get(len);
                map.put(len, value+1);
            } else {
                map.put(len, 1);
            }
        }
        int maxValue = 0;
        for (Entry<Integer, Integer> ety : map.entrySet()) {
            if (ety.getValue() > maxValue) {
                answer = ety.getValue();
                maxValue = answer;
            } 
        }
        return answer;
    }
}