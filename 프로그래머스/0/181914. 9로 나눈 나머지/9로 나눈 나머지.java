class Solution {
    public int solution(String number) {
        int num = 0;
        for(char ch : number.toCharArray()) {
            num += (int)ch-48;
        }
        return num % 9;
    }
}