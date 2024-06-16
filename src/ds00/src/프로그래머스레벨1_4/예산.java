package 프로그래머스레벨1_4;
import java.util.Arrays;

public class 예산 {
	   
}

class Solution32 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++){
            budget = budget - d[i];
            if(budget >=0){
                answer++;
            }else{
                break;
            }
        }
        return answer;
    }
}