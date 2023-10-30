class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] arr = new int[num_list.length];
        int count = 0;
        
        for(int i = n; i < num_list.length; i++){
            arr[i - n] = num_list[i];
            count++;
        }
        
        for(int j = 0; j < n; j++){
            arr[j + count] = num_list[j];
        }
        
        return arr;
    }
}