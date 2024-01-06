import java.util.*;

class Solution {
    public long solution(long n) {
        
        String s = String.valueOf(n);
        
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        String str = new String(arr);
        long answer = Long.parseLong(new StringBuilder(str).reverse().toString());
        return answer;
    }
}