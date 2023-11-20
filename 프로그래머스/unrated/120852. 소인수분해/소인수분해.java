import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 2; i <= Math.sqrt(n); i++){
            while(n % i == 0){
                if(!list.contains(i)){
                    list.add(i);
                }
                n /= i;
            }
        }
        
        if(n != 1){
            list.add(n);
        }
        
        int[] answer = list.stream()
            .mapToInt(i -> i)
            .toArray();
            
        return answer;
    }
}