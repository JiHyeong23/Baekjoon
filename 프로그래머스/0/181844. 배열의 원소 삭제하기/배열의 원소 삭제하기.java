class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int len = arr.length;
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    flag = true;
                }
            } if (!flag) {
                answer[i] = arr[i];
            }
        }
        for(int i : answer) {
            if(i == 0) {
                len--;
            }
        }
        int[] ans = new int[len];
        int idx = 0;
        for (int i : answer) {
            if (i != 0) {
                ans[idx] = i;
                idx++;
            }
        }
        return ans;
    }
}