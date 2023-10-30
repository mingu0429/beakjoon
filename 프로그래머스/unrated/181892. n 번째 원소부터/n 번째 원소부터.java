import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] arr ={};
        
        arr = Arrays.copyOfRange(num_list, n - 1, num_list.length);
        
        return arr;
    }
}