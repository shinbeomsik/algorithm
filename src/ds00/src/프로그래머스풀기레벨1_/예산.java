package 프로그래머스풀기레벨1_1회차반복;
import java.util.*;

public class 예산 {

	public static void main(String[] args) {
		Solution31 sol = new Solution31();
		int[] d = {};
		int budget = 1;

		int answer = sol.solution(d, budget);
		System.out.println(answer);

	} 
}

class Solution31 {
	 public int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        for(int i=0;i<d.length;i++){
	            if(budget>=d[i]){
	               budget = budget - d[i];
	                answer++;
	            }else{
	                break;
	            }
	        
	        }
	        return answer;
	    }
}