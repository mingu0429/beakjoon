class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        double x1 = dots[0][0];
        double y1 = dots[0][1];
        double x2 = dots[1][0];
        double y2 = dots[1][1];
        double x3 = dots[2][0];
        double y3 = dots[2][1];
        double x4 = dots[3][0];
        double y4 = dots[3][1];
        
        if(((y1 - y2) / (x1 - x2)) == ((y3 - y4) / (x3 - x4))){
            answer = 1;
        }
        if(((y1 - y3) / (x1 - x3)) == ((y2 - y4) / (x2 - x4))){
            answer = 1;
        }
        if(((y1 - y4) / (x1 - x4)) == ((y3 - y2) / (x3 - x2))){
            answer = 1;
        }
        return answer;
    }
}