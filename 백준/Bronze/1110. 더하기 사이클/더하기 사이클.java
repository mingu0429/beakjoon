import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int a = num;
        int count = 0;
        while(true){
            a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
            count ++;
            
            if(a == num){
                break;
            }
        }
        
        System.out.print(count);        
    }
}