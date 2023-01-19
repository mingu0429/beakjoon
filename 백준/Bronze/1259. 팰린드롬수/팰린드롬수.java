import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            String str = br.readLine();
            
            if(str.equals("0")) break;
            
            int length = str.length();
            boolean check = true;
            
            for(int i = 0; i <= length / 2; i++){
                if(str.charAt(i) != str.charAt(length - i -1)){
                    check = false;
                }
            }
            
            if(!check){
                sb.append("no\n");
            }else{
                sb.append("yes\n");
            }                       
        }
        System.out.print(sb);
    } 
}