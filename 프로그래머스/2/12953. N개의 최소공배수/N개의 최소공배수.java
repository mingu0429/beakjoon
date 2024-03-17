import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = arr[arr.length - 1];
        
        for(int i = arr.length - 1; i > 0; i--){
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    
    public static int gcd(int x, int y){
        int gcd = 0;
        while(y > 0){
            gcd = x % y;
            x = y;
            y = gcd;
        }
        return x;
    }
    
    public static int lcm(int x, int y){
        return (x * y) / gcd(x, y);
    }
}