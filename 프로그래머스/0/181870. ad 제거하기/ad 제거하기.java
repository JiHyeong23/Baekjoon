class Solution {
    public String[] solution(String[] strArr) {
        int len = strArr.length;
        String[] tempAnswer = new String[len];
        int count = 0;

        for (String str : strArr) {
            if (!str.contains("ad")) {
                tempAnswer[count] = str;
                count++;
            }
        }

        String[] answer = new String[count];
        System.arraycopy(tempAnswer, 0, answer, 0, count);
        return answer;
    }
}