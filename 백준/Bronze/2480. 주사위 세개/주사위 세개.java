import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        int money;
        int max = Math.max(c, Math.max(a, b));
        
        
        if((a == b) && (a == c)){
            money = 10000 + a * 1000;
        }else if((a == b) && (c != a)){
            money = 1000 + a * 100;
        }else if((b == c) && (a != b)){
            money = 1000 + b * 100;
        }else if((c == a) && (b != a)){
            money = 1000 + c * 100;
        }else{
            money = max * 100;
        }
        System.out.print(money);
    }
}