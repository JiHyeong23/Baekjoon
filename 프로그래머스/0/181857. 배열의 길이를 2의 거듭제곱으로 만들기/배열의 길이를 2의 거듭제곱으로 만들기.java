class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        while ((len & (len-1)) != 0) {
            len++;
            System.out.println(len);
        }
        int[] answer = new int[len];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }
}