import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            if((stack.empty()) || (arr[i] != stack.peek())){
                stack.push(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for(int j = stack.size() - 1; j >= 0; j--){
            answer[j] = stack.pop();
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello");

        return answer;
    }
}