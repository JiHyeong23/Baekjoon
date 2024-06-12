class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int a = num_list[num_list.length-1];
        int b = num_list[num_list.length-2];
        if (a > b) {
            System.arraycopy(num_list, 0, answer, 0, num_list.length);
            answer[answer.length-1] = a - b;
        } else {
            System.arraycopy(num_list, 0, answer, 0, num_list.length);
            answer[answer.length-1] = a * 2;
        }
        return answer;
    }
}