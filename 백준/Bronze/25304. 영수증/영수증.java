import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int count = sc.nextInt();
        int result = 0;
        for(int i = 0; i < count; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            result = result + a * b;
        }
        if(money == result){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}