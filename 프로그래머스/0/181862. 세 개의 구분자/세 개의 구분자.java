import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> tmp = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        
        for (char i : myStr.toCharArray()) {
            if (i == 'a' || i == 'b' || i == 'c') {
                if (str.length() > 0) {
                    tmp.add(str.toString());
                    str.setLength(0); 
                }
            } else {str.append(i);}
        }
        
        if (str.length() > 0) {
            tmp.add(str.toString());
        }
        
        if (tmp.isEmpty()) {
            tmp.add("EMPTY");
        }
        
        return tmp.toArray(new String[0]);
    }
}