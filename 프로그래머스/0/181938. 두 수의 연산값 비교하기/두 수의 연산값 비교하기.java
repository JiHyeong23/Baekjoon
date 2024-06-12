class Solution {
    public int solution(int a, int b) {
        String stuf = ""+ a + b;
        int add = Integer.parseInt(stuf);
        return (add > a*b*2) ? add : a*b*2;
    }
}