class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int length = num_list.length;
        
        for(int i = 0; i < length; i++){
            answer[i] = num_list[i];
        }
        
        if(num_list[length - 1] > num_list[length - 2]){
            answer[length] = num_list[length - 1] - num_list[length - 2]; 
        } else {
            answer[length] = num_list[length - 1] * 2;
        }
        return answer;
    }
}