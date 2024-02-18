import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] arr = new int[3];
        List<Integer> list = new ArrayList<>();
        
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(num1[i % 5] == answers[i]) arr[0]++;
            if(num2[i % 8] == answers[i]) arr[1]++;
            if(num3[i % 10] == answers[i]) arr[2]++;
        }
        
        int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
        for(int i = 0; i < arr.length; i++){
            if(max == arr[i]){
                list.add(i + 1);
            }
        }
        
        Collections.sort(list);
        
        int[] answer = list.stream()
            .mapToInt(i -> i)
            .toArray();
        
        return answer;
    }
}