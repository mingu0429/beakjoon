import java.util.*;

class Solution {
    public int solution(int[] arr) {
        
        int[] temp = new int[arr.length];
        int count = 0;
        temp = Arrays.copyOf(arr, arr.length);
        
        while(true){
            
            for(int i = 0 ; i < arr.length; i++){
            if((arr[i] >= 50) && (arr[i] % 2 == 0)){
                arr[i] = arr[i] / 2;
            }else if((arr[i] < 50) && (arr[i] % 2 == 1)){
                arr[i] = arr[i] * 2 + 1;
            }
            }
            if(Arrays.equals(arr, temp)){
                return count;
            }
            temp = Arrays.copyOf(arr, arr.length);
            count++;
        }
        
    }
}