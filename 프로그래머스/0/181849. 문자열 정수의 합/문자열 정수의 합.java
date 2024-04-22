class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            //System.out.println(num_str.charAt(i));
            //char a = 0;
            //System.out.println(a);
            answer += num_str.charAt(i) - 48;
        }
        return answer;
    }
}