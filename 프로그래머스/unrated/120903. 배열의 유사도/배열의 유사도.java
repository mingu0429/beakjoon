class Solution {
    public int solution(String[] s1, String[] s2) {
        int cnt = 0;
        
        for(String string1 : s1){
            for(String string2 : s2){
                if(string1.equals(string2)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}