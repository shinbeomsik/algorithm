package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class 할일목록 {

	public static void main(String[] args) {
		Solution97 sol = new Solution97();
		String[] todo_list ={}; 
		boolean[] finished = {};

		 List<String> answer = sol.solution(todo_list, finished);
		System.out.println(answer);

	}
}

class Solution97 {
	  public List<String> solution(String[] todo_list, boolean[] finished) {
	       List<String> answer = new ArrayList<>();
	        for(int i=0;i<finished.length;i++){
	            if(finished[i]==false){
	                answer.add(todo_list[i]);
	            }
	        }
	        return answer;
	    }
}