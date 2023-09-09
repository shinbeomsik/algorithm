
package 프로그래머스풀기레벨0;

import java.util.*;
public class 할일목록 {

	public static void main(String[] args) {
		Solution66 sol = new Solution66();
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"}; 
		boolean[] finished = {true, false, true, false};
		 List<String> answer = sol.solution(todo_list, finished);
		System.out.println(answer);

	}
}  

class Solution66 {
    public  List<String> solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        
        for(int i = 0; i<finished.length;i++) {
        	if(finished[i] == false) {
        		answer.add(todo_list[i]);
        	}
        }
        
        return answer;
    }
}