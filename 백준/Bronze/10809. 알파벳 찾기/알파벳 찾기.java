import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        String word = br.readLine();              
        
        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        
        for(int i = 0; i < word.length(); i++){            
            char c = word.charAt(i);
        
            if(arr[c - 97] == -1){
                arr[c - 97] = i;    
            }     
        }
        
        for(int num : arr){
            System.out.print(num + " ");
        }
        
        
        
        
    }
}