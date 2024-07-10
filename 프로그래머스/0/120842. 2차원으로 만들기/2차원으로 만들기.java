class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int idx = 0;
        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][idx] = num_list[i];
            idx++;
            if (idx == n) {
                idx = 0;
            }
        }
        return answer;
    }
}