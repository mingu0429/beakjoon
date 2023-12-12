class Solution {
    public int solution(int[][] lines) {
        int cnt = 0;
        int min = Math.min(Math.min(lines[0][0], lines[1][0]), lines[2][0]);
        int max = Math.max(Math.max(lines[0][1], lines[1][1]), lines[2][1]);
        
        int[] arr = new int[max - min];
        for(int i = 0; i < 3; i++){
            for(int j = lines[i][0]; j < lines[i][1]; j++){
                arr[j - min]++;
            }
        }
        
        for(int k = 0; k < arr.length; k++){
            if(arr[k] >= 2){
                cnt++;
            }
        }
        
        
        
        
        return cnt;
    }
}