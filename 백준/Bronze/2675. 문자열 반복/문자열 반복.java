import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            String[] str = br.readLine().split(" ");
            
            int num = Integer.parseInt(str[0]);
            String word = str[1];
            
            for(int j = 0; j < word.length(); j++){
                for(int k = 0; k < num; k++){
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
        
                
    }
}