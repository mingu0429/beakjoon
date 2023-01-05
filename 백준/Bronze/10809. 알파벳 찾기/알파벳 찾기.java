import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();       
        sc.close();
        
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