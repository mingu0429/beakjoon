import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        Stack<Integer> stack = new Stack<>(); // int형 스택 선언
        
        int n = Integer.parseInt(br.readLine());
        
        int num = 0;
                          
        while(n-- > 0){
            int input = Integer.parseInt(br.readLine());
            
            if(num < input){
                for(int i = num + 1; i <= input; i++){
                    stack.push(i);
                    sb.append("+\n");
                }
                num = input;
            }else if(stack.peek() != input){
                System.out.print("NO");
                return;
            }
            
            stack.pop();
            sb.append("-\n");
        }
        
        System.out.print(sb);   
    }
}