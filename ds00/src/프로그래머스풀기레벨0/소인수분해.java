package 프로그래머스풀기레벨0;

import java.util.*;

public class 소인수분해 {

	public static void main(String[] args) {
		Solution122 sol = new Solution122();
		int n = 420;

		int[] answer = sol.solution(n);
		System.out.println(answer);

	}
}  

class Solution122 {
	 public int[] solution(int n) {
	        HashSet<Integer> tmp = new HashSet<Integer>();
	        for(int i = 2; i <= n; i++) {
	            if(n % i == 0) {
	                while(n % i == 0)
	                    n /= i;
	                tmp.add(i);
	            }
	        }
	        Integer[] tmp_answer = tmp.toArray(new Integer[0]);
	        int answer[] = new int[tmp_answer.length];
	        for(int i = 0; i < tmp_answer.length; i++)
	            answer[i] = tmp_answer[i];
	        Arrays.sort(answer);
	        return answer;
	    }
}