class Solution {
    public int solution(int[] array) {
        int cnt = 0;
        String str = "";
        
        for(int i : array){
            str += Integer.toString(i);
        }
        
        for(char c : str.toCharArray()){
            if(c == '7'){
                cnt++;
            }
        }
        return cnt;
    }
}