import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char temp;
        
        for(int i = 0; i < queries.length; i++){
            int first = queries[i][0];
            int last = queries[i][1];
            
            for(int j = first; j <= (first + last) / 2; j++){
                temp = arr[j];
                arr[j] = arr[first + last - j];
                arr[first + last - j] = temp;
            }
        }
        
        return String.valueOf(arr);
    }
}