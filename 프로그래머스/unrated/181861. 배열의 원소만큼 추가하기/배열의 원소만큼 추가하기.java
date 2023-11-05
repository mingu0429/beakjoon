import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int j = 0; j < arr.length; j++){
            for(int k = 0; k < arr[j]; k++){
                list.add(arr[j]);
            }
        }
        
        int[] X = list.stream()
            .mapToInt(i -> i)
            .toArray();
        
        return X;
    }
}