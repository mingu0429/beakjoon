import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(n);
        
        while(n != 1){
            if(n % 2 == 0){
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}