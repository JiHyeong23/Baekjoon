class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String word = "";
        for (int i = myString.length(); i <= myString.length(); i--) {
            word = myString.substring(0, i);
            if (word.endsWith(pat)) {
                return word;
            }
        }
        return answer;
    }
}