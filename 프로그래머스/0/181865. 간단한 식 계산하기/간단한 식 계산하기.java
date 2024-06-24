class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] tmp = binomial.split(" ");
        if (tmp[1].equals("+")) {
            answer = Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[2]);
            return answer;
        } else if (tmp[1].equals("-")) {
            answer = Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[2]);
            return answer;
        } else {
            answer = Integer.parseInt(tmp[0]) * Integer.parseInt(tmp[2]);
            return answer;
        }
    }
}