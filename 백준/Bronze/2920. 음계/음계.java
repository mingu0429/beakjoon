import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int[] arr = new int[8];
        
        for(int i = 0; i < 8; i++){
            arr[i] = Integer.parseInt(st.nextToken());            
        }
        
        boolean asc = true;
        boolean dsc = true;
        
        for(int j = 1; j < 8; j++){
            if(arr[j] >= arr[j - 1]){
                dsc = false;               
            }else if(arr[j] <= arr[j - 1]){
                asc = false;
            }
        }
        
        if(asc){
            System.out.print("ascending");
        }else if(dsc){
            System.out.print("descending");
        }else{
            System.out.print("mixed");
        }
    }
}