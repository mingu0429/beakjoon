class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        
        for(int n = i; n <= j; n++){
            cnt += String.valueOf(n).length() - String.valueOf(n).replace(String.valueOf(k), "").length();
        }
        return cnt;
    }
}