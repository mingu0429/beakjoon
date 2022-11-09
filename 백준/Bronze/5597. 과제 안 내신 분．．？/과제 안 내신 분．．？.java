import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        int j;
        for(int i = 0; i < 28; i++){
            j = sc.nextInt();
            arr[j - 1] = 1;
        }
        sc.close();
        for(int i = 0; i < 30; i++){
            if(arr[i] != 1){
                System.out.println(i+1);
            }
        }
    }
}