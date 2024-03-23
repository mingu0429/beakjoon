import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = s;
        
        for(int i = 0; i < s.length(); i++){
            str = str.substring(1) + str.charAt(0);
                if(test(str)) answer++;
        }
        return answer;
    }
    
    public boolean test(String str){
        Stack<Character> stack = new Stack<>();
        char[] arr = str.toCharArray();
        
        for(char c : arr){
            if(stack.isEmpty()){
                stack.push(c);
            }else if(stack.peek() == '[' && c == ']'){
                stack.pop();
            }else if(stack.peek() == '{' && c == '}'){
                stack.pop();
            }else if(stack.peek() == '(' && c == ')'){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}