class Solution {
    public int solution(int[] array, int n) {
        int val = Math.abs(array[0] - n);
        int idx = 0;
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            int minus = Math.abs(array[i] - n);
            if (val > minus) {
                idx = i;
                val = minus;
            } else if (val == minus) {
                val = minus;
                if (array[idx] > array[i]) {
                    idx = i;
                }
            }
        }
        return array[idx];
    }
}