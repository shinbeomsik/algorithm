package 프로그래머스풀기레벨0;

import java.util.*;
public class 문자열잘라서정렬하기 {

	public static void main(String[] args) {
		Solution73 sol = new Solution73();
		String myString = "dxccxbbbxxaaaa";
		

		List<String> answer = sol.solution(myString);
		System.out.println(answer);

	}
}  

class Solution73 {
	  public List<String> solution(String myString) {
	        String[] arr = myString.split("x");
	        Arrays.sort(arr);
	        
	        List<String> answer = new ArrayList<>();
	        for(int i=0; i<arr.length;i++) {
	        	if(!arr[i].equals("")) {
	        		answer.add(arr[i]);
	        	}
	        }
	        return answer;
	    }
}