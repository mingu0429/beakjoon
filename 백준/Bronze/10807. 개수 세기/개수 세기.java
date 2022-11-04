import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] array = new int[num];
        int count = 0;
        for(int i = 0; i < num; i++){
            array[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        sc.close();
        for(int i = 0; i < num; i++){
            if(v == array[i]){
                count++;
            }
        }
       System.out.print(count);
    }
}