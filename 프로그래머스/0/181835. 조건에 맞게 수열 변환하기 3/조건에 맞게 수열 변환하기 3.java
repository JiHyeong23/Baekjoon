class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int j = 0;
        if (k % 2 == 0) {
            for (int i : arr) {
                answer[j] = i + k;
                j++;
            }
        } else {
            for (int i : arr) {
                answer[j] = i * k;
                j++;
            }
        }
        return answer;
    }
}