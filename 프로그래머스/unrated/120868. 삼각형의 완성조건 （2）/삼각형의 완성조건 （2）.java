import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        
        int cnt = 0;
        Arrays.sort(sides);//7, 11
        
        if(sides[0] == sides[1]){
            cnt = sides[0] + sides[1] - 1;
        }else if(sides[1] > sides[0]){
        // 가장 긴 변이 sides[1]인 경우
        for(int i = sides[1]; i >= 0; i--){
            if(sides[0] + i == sides[1]){
                break;
            }
            cnt++;
        }
        }
        // 나머지가 최고 길이인 경우
        if(sides[1] - sides[0] > 1){
            for(int j = sides[1] + 1; j < sides[0] + sides[1]; j++){
                cnt++;
            }
        }
        
        return cnt;
    }
}