import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < intStrs.length; i++){
            char[] charArr = intStrs[i].toCharArray();
            String str = "";
            
            for(int j = s; j < s + l; j++){
                str += charArr[j];
            }
            int num = Integer.parseInt(str);
            
            if(num > k){
                list.add(num);
            }
        }
        
        int[] arr = list.stream()
            .mapToInt(m -> m)
            .toArray();
        
        return arr;
    }
}