import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[26];
        String word = br.readLine();
        
        for(int i = 0; i < word.length(); i++){
            if('a' <= word.charAt(i) && word.charAt(i) <= 'z'){
                arr[word.charAt(i) - 'a']++;
            } else{
                arr[word.charAt(i) - 'A']++;
            }
        }
        int max = -1;
        char ch = '?';
        for(int i = 0; i < 26; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char)(i + 65);
            } else if(arr[i] == max){
                ch = '?';
            }           
        }
        System.out.print(ch);
    }
}