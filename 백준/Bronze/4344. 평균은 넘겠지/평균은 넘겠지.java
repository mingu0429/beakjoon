import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        
        for(int i = 0; i < testCase; i++){
            st  = new StringTokenizer(br.readLine()," ");
            
            int num = Integer.parseInt(st.nextToken());
            int[] arr = new int[num];
            
            double sum = 0;
            
            for(int j = 0; j < num; j++){
                int score = Integer.parseInt(st.nextToken());
                arr[j] = score;
                sum = sum + score;
            }
            double mean = (sum / num);
            double count = 0;
            
            for(int j = 0; j < num; j++){
                if(arr[j] > mean){
                    count ++;
                }
            }
            System.out.printf("%.3f%%\n",count / num * 100);
            
        }
    }
}