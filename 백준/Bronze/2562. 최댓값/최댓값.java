import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = arr[0];
        int num = 0;
        for(int i = 0; i < 9; i++){
            if(arr[i] >= max){
                max = arr[i];
                num = i;
            }
        }
        System.out.printf(max + "\n" + (num + 1));        
    }
}