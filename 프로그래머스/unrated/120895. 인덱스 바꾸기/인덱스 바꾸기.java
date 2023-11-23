class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        char temp = my_string.charAt(num1);

        char[] arr = my_string.toCharArray();
        arr[num1] = arr[num2];
        arr[num2] = temp;
        
        my_string = String.valueOf(arr);
        return my_string;
    }
}