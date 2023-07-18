class Solution {
    public int solution(int[] num_list) {
        int multi = 1;
        int sum = 0;
        
        for(int i = 0; i < num_list.length; i++){
            multi = multi * num_list[i];
            sum = sum + num_list[i];    
        }
        
        return multi < sum*sum ? 1 : 0;
    }
}