package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class x사이의개수 {

	public static void main(String[] args) {
		Solution111 sol = new Solution111();
		String myString= "";

		List<Integer> answer = sol.solution(myString);
		System.out.println(answer);

	}
}

class Solution111 {
	 public List<Integer> solution(String myString) {
	     
	        String[] arr = myString.split("x");
	        List<Integer> answer = new ArrayList<>();
	        for(int i=0;i<arr.length;i++){
	            answer.add(arr[i].length());
	        }
	        String[] brr = myString.split("");
	        if(brr[brr.length-1].equals("x")){
	            answer.add(0);
	        }
	        return answer;
	    }
}