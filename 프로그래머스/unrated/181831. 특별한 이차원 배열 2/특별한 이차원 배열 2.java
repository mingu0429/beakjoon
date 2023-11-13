class Solution {
    public int solution(int[][] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length - 1; j > 0; j--){
                if(arr[i][j] != arr[j][i]){
                    return 0;
                }
            }
        }
        return 1;
    }
}