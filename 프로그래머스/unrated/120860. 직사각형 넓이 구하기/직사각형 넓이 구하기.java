class Solution {
    public int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];
        int x2 = 0;
        int y2 = 0;
        
        for(int i = 1; i < dots.length; i++){
            if(x != dots[i][0]){
                x2 = dots[i][0];
                break;
            }
        }
        
        for(int j = 1; j < dots.length; j++){
            if(y != dots[1][1]){
                y2 = dots[j][1];
                break;
            }
        }
        
        return Math.abs((x - x2) * (y - y2));
    }
}