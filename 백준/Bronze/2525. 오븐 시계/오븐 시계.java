import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        int hour = c / 60;
        int minute = c % 60;
        
        if(m + minute >= 60){
            m = m + minute - 60;
            h = h + hour + 1;
            if(h >= 24){
                h = h % 24;
            }
        }else if(m + minute < 60){
            m = m + minute;
            h = h + hour;
            if(h >= 24){
                h = h % 24;
            }
        }
        System.out.print(h + " " + m);
    }
}