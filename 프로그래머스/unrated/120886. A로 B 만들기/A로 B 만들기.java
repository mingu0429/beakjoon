import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        int answer = 3;
        
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.toString(arr1).equals(Arrays.toString(arr2))){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}