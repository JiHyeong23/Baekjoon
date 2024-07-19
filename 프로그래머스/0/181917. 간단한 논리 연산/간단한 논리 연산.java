class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean re1 = set(x1, x2);
        boolean re2 = set(x3, x4);

        if (re1 && re2) return true;
        else return false;
    }
    
    public boolean set(boolean x, boolean y) {
        if (x == false && y == false) return false;
        else {
            return true;
        }
    }
}