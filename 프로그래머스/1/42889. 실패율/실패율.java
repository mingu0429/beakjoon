import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] ing = new int[N + 1];
        int[] clear = new int[N + 1];
        
        for(int i = 0; i < stages.length; i++){
            for(int j = 0; j < stages[i]; j++){
                clear[j]++;
            }
            ing[stages[i] - 1]++;
        }
        
        Map<Integer, Double> map = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            if(ing[i] == 0 || clear[i] == 0){
                map.put(i + 1, 0.0);
            } else {
                map.put(i + 1, (double)ing[i] / (double)clear[i]);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}