import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print(arithmetic_sequence(sc.nextInt()));
        sc.close();
    }
    
    public static int arithmetic_sequence(int num){
        
        int result = 0;
        
        if(num < 100){
            result = num;
        }else if(num == 1000){      
            result = 144;
        }else{       
            result = 99;
            for(int i = 100; i <= num; i++){
                int a = i / 100;
                int b = (i % 100) / 10;
                int c = i % 10;
                
                if((a - b) == (b - c)){
                    result++;
                }
            }
        }
        return result;
    }
}