package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 접미사배열 {

	public static void main(String[] args) {
		Solution118 sol = new Solution118();
		String my_string= "";

		 List<String> answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution118 {
	 public List<String> solution(String my_string) {
	        List<String> answer = new ArrayList<>();
	        
	        String[] arr = my_string.split("");
	        String k = "";
	        for(int i=arr.length-1;i>=0;i--){
	            k =arr[i] + k; 
	            answer.add(k);
	      
	        }
	        Collections.sort(answer);
	        return answer;
	    }
}