package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;

public class ad제거하기 {

	public static void main(String[] args) {
		Solution119 sol = new Solution119();
		String[] strArr = {};

		List<String> answer = sol.solution(strArr);
		System.out.println(answer);

	}
}

class Solution119 {
	   public List<String> solution(String[] strArr) {
	        List<String> answer = new ArrayList<>();
	        for(int i=0;i<strArr.length;i++){
	            if(!strArr[i].contains("ad")){
	                answer.add(strArr[i]);
	            }
	        }
	        return answer;
	    }
}