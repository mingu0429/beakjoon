import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int num = 1;
        
        while(num <= n){
            System.out.println(num);
            num++;
        }
    }
}