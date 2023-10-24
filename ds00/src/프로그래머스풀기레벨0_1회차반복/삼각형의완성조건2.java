package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 삼각형의완성조건2 {

	public static void main(String[] args) {
		Solution176 sol = new Solution176();
		int[] sides= {};
		
		int answer = sol.solution(sides);
		System.out.println(answer);

	}
}

class Solution176 {
	public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        if(sides[0] == sides[1]){
            for(int i=1; i<sides[0]+ sides[1];i++){
                answer++;
            }
        }else{
            for(int i= 1; i<sides[1];i++){
                if(i + sides[0] > sides[1]){
                    answer++;
                    }
                }
            for(int i=sides[1];i<sides[0] + sides[1];i++){
                if(sides[0]+sides[1] > i){
                    answer++;
                }
            }
        }
        
        
        return answer;
    }
}