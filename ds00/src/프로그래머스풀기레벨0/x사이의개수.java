package 프로그래머스풀기레벨0;

import java.util.*;

public class x사이의개수 {

	public static void main(String[] args) {
		Solution70 sol = new Solution70();
		String myString = "oxooxoxxox";

		List<Integer> answer = sol.solution(myString);
		System.out.println(answer);

	}
}  

class Solution70 {
	  public List<Integer> solution(String myString) {
	        List<Integer> answer = new ArrayList<>();
	        String[] arr = myString.split("x");
	        System.out.println(Arrays.toString(arr));
	        for(int i=0; i<arr.length;i++) {
	        	answer.add(arr[i].length());
	        }
	        if(myString.charAt(myString.length()-1) =='x') {
	        	answer.add(0);
	        };
 	        return answer;
	    }
}