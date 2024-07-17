class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int q = i; q <= j; q++) {
            String num = q + "";
            for (char ch : num.toCharArray()) {
                if ((int)ch-48 == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}