class Solution {
    public int solution(int n) {
        int answer = 1;
        if (n == 1) return 1;
        for (int i = 1; i < n; i++) {
            n /= i;
            if (n >= i) answer++;
        }
        return answer;
    }
}