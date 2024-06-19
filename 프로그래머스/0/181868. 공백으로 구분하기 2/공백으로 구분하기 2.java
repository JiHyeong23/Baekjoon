class Solution {
    public String[] solution(String my_string) {
        String str = my_string.trim();
        String[] answer = str.split("\\s+");
        return answer;
    }
}