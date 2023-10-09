package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class A_5명씩 {

	public static void main(String[] args) {
		Solution83 sol = new Solution83();
		String[] names = {};
		
		 List<String> answer = sol.solution(names);
		System.out.println(answer);

	}
}

class Solution83 {
	   public List<String> solution(String[] names) {
	        List<String> answer = new ArrayList<>();
	        for(int i=0;i<names.length;i = i + 5){
	            answer.add(names[i]);
	        }
	        return answer;
	    }
}