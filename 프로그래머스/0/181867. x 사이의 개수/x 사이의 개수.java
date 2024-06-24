class Solution {
    public int[] solution(String myString) {
        int count = 0;
        for(char ch : myString.toCharArray()) {
            if (ch == 'x') {
                count++;
            }
        }
        int[] answer = new int[++count];
        int cnt = 0;
        int idx = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                answer[idx] = cnt;
                idx++;
                cnt = 0;
            } else {
                cnt++;
            }
            answer[answer.length-1] = cnt;
        }
        return answer;
    }
}