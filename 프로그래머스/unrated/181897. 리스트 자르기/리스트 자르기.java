import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        int[] arr = {};
        
        if(n == 1){
            
            arr = Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
            
        } else if(n == 2){
            
            arr = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            
        } else if(n == 3){
            
            arr = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            
        } 
        else if(n == 4){
            
            List<Integer> list = new ArrayList<>();
            
            for(int i = slicer[0]; i < slicer[1] + 1; i+=slicer[2]){
                list.add(num_list[i]);
            }
            
            int[] arr4 = list.stream()
                .mapToInt(i -> i)
                .toArray();
            
            return arr4;
            
        }
        
        return arr;
        
    }
}