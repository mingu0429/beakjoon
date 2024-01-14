class Solution {
    public String solution(String phone_number) {
        char[] arr = phone_number.toCharArray();
        
        for(int i = 0; i < arr.length - 4; i++){
            arr[i] = '*';
        }
        
        String str = new String(arr);
        return str;
    }
}