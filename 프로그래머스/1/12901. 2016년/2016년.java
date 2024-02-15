class Solution {
    public String solution(int a, int b) {
        
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        int temp  = 0;
        
        for(int i = 1; i < a; i++){
            temp += month[i - 1];
        }
        temp += b;
        
        return day[(temp - 1) % 7];
    }
}