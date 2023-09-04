
package 프로그래머스풀기레벨0;
import java.util.*;

public class 원소들의곱과합 {

	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		int[] num_list = {3, 4, 5, 2, 1};

		int answer = sol.solution(num_list);
		System.out.println(answer);

	}
}

class Solution13 {
	 public int solution(int[] num_list) {
	        int answer = 0;
	        int plus = 0;
	        int se =1;
	        for (int i = 0; i < num_list.length; i++) {
				plus = plus + num_list[i];
				se = se*num_list[i];
			}
	        plus = plus*plus;
	        if(plus > se){
	        	answer = 1;
	        }else {
	        	answer = 0;
	        }
	        return answer;
	    }
}