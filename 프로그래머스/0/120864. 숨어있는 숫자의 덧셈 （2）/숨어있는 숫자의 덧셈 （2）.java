class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = "0";
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) > 47 && my_string.charAt(i) < 58) {
                num += my_string.charAt(i);
                if (i == my_string.length()-1) {
                    answer += Integer.parseInt(num);
                }
            } else {
                answer += Integer.parseInt(num);
                num = "0";
            }
        }
        return answer;
    }
}