package 프로그래머스풀기레벨0;

import java.util.*;
public class OX퀴즈 {

	public static void main(String[] args) {
		Solution151 sol = new Solution151();
		String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};

		List<String> answer = sol.solution(quiz);
		System.out.println(answer);

	}
}  

class Solution151 {
	public List<String> solution(String[] quiz) {
		List<String> answer = new ArrayList<>();
        for(int i=0;i<quiz.length;i++) {
        	String[] arr = quiz[i].split(" ");
        	
        	if(arr[1].equals("+")) {
        		if(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
        			answer.add("O");
        		}else {
        			answer.add("X");
        		}
        	}else if(arr[1].equals("-")) {
        		if(Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
        			answer.add("O");
        		}else {
        			answer.add("X");
        		}
        	}
        }
        return answer;
    }
}