class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int s, e;
        
        for(int i = 0; i < queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];
            
            for(int j = s; j <= e; j++){
                arr[j]++;
            }
        }
        
        return arr;
    }
}