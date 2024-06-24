class Solution {
    public String solution(String myString) {
        String answer = ""; 
        myString = myString.toLowerCase();
        for(char ch : myString.toCharArray()) {
            if (ch == 'a') {
                answer += 'A';
            } else {
                answer += ch;
            }
        }
        return answer;
    }
}