class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        int emg = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    emg++;
                } else if (emergency[i] < emergency[j]) {
                    emg++;
                }
            }
            answer[i] = emg;
            emg = 0;
        }
        return answer;
    }
}