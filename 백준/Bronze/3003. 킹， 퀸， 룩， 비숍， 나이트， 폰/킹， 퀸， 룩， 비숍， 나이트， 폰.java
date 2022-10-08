import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop =2;
        int knight = 2;
        int pawn = 8;
        
        System.out.print(king - sc.nextInt()+ " ");
        System.out.print(queen - sc.nextInt()+ " ");
        System.out.print(rook - sc.nextInt()+ " ");
        System.out.print(bishop - sc.nextInt()+ " ");
        System.out.print(knight - sc.nextInt()+ " ");
        System.out.print(pawn - sc.nextInt());
    }
}