import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int result = 1;
        
        for(int i = 0; i < 3; i++){
            int num = Integer.parseInt(br.readLine());           
            result = result * num;
        }
        
        int[] arr = new int[10];
        
        while(result > 0){
            int i = result % 10;
            result = result / 10;
            arr[i]++;
        }
        for(int j = 0; j < 10; j++){
            System.out.println(arr[j]);
        }
    }
}