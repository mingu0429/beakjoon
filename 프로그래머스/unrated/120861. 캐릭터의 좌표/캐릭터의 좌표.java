class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int[] location = new int[2];
        int borderX = board[0] / 2;
        int borderY = board[1] / 2;
        
        for(String s : keyinput){
            if(s.equals("up")){
                if(location[1] < borderY){
                    location[1]++;
                }
            }else if(s.equals("down")){
                if(location[1] > -1 * borderY){
                    location[1]--;
                }
            }else if(s.equals("right")){
                if(location[0] < borderX){
                    location[0]++;
                }
            }else if(s.equals("left")){
                if(location[0] > -1 *borderX){
                    location[0]--;
                }
            }
        }
        return location;
    }
}