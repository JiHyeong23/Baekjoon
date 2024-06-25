import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] strs = myString.split("x");
        Arrays.sort(strs);
        strs = Arrays.stream(strs)
            .filter(s -> !s.isEmpty())
            .toArray(String[]::new);
        return strs;
    }
}