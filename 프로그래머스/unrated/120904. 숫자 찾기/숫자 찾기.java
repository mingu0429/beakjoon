import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int num, int k) {
        
        int[] arr = Stream.of(String.valueOf(num).split(""))
            .mapToInt(Integer::parseInt)
            .toArray();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                return i + 1;
            }
        }
        return -1;
    }
}