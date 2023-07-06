import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(char c : a.toCharArray()){
            if(c >= 97 && c <= 122){
                answer = answer + (char)(c - 32);
            }else{
                answer = answer + (char)(c + 32);
            }
        }
        
        System.out.println(answer);
    }
}