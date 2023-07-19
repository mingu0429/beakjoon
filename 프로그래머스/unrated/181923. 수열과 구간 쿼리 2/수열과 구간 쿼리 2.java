class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int s, e, k;
        int n = 1000001;
        
        for(int i = 0; i < queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];
            k = queries[i][2];
            answer[i] = n;
            
            for(int j = s; j <= e; j++){
                if(arr[j] > k){
                    if(arr[j] < answer[i]){
                        answer[i] = arr[j];
                    }
                }
            }
            if(answer[i] == n){
            answer[i] = -1;
        }
        }
            
        return answer;
    }
}