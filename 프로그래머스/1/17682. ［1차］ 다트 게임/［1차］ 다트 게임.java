class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        int idx = -1;
        char[] arr = dartResult.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= '0' && arr[i] <= '9'){
                idx++;
                score[idx] += Integer.parseInt(String.valueOf(arr[i]));
                if(arr[i] == '1' && arr[i + 1] == '0'){
                    score[idx] = 10;
                    i++;
                }
            }else if(arr[i] == 'D'){
                score[idx] = (int) Math.pow(score[idx], 2);
            }else if(arr[i] == 'T'){
                score[idx] = (int) Math.pow(score[idx], 3);
            }else if(arr[i] == '*'){
                if (idx > 0) score[idx-1] *=2;
                score[idx] *= 2;
            }else if(arr[i] == '#'){
                score[idx] *= -1;
            }
        }
        answer = score[0] + score[1] + score[2];
        return answer;
    }
}