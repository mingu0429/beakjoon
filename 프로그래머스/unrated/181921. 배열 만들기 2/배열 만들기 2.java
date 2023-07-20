import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> arr = new ArrayList<Integer>();
        int count;
        
        for(int i = l; i <= r; i++){
            String str = Integer.toString(i);
            count = 0;
            for(int j = 0; j < str.length(); j++){
                if((str.charAt(j) == '5') || (str.charAt(j) == '0')){
                    count++;
                }
            }
            if(str.length() == count){
                arr.add(i);
            }
        }
        if(arr.isEmpty()){
                arr.add(-1);
            }
        int[] answer = arr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}