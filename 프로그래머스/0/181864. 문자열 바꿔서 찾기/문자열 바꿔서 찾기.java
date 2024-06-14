class Solution {
    public int solution(String myString, String pat) {
        String str = "";
        for (char ch : myString.toCharArray()) {
            if (ch == 'A') {
                str += 'B';                
            } else {
                str += 'A';
            }
        }
        return (str.contains(pat)) ? 1 : 0;
    }
}