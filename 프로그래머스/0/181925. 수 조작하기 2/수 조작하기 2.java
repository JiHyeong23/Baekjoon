class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int num = numLog[0];
        for(int i = 1; i < numLog.length; i++) {
            if(numLog[i] == num + 1) {
                answer += "w";
            } else if (numLog[i] == num - 1) {
                answer += "s";
            } else if (numLog[i] == num + 10) {
                answer += "d";
            } else if (numLog[i] == num - 10) {
                answer += "a";
            }
            num = numLog[i];
        }
        return answer;
    }
}