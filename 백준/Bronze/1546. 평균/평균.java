import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double arr[] = new double[Integer.parseInt(br.readLine())];
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        double sum = 0;
        
        for(int i = 0; i < arr.length; i++){
            sum = sum + ((arr[i] / arr[arr.length - 1]) * 100) / arr.length;
        }
        
        System.out.print(sum);
    }
}