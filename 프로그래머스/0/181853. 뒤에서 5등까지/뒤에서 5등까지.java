import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        boolean flag;
        for(int i = 0; i < num_list.length -1; i++) {
            //flag = false;
            for(int j = i + 1; j < num_list.length; j++) {
                int tmp = 0;
                if (num_list[i] >= num_list[j]) {
                    tmp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = tmp;
                    flag = true;
                }
            } //if (!flag) {
                //break;
            //}
        }
        int[] answer = Arrays.copyOf(num_list, 5);
        return answer;
    }
}