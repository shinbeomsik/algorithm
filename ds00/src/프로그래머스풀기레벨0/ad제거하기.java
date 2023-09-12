package 프로그래머스풀기레벨0;

import java.util.*;

public class ad제거하기 {

	public static void main(String[] args) {
		Solution79 sol = new Solution79();
		String[] strArr = {"and","notad","abcd"};

		List<String> answer = sol.solution(strArr);
		System.out.println(answer);

	}
}  

class Solution79 {
	  public List<String> solution(String[] strArr) {
	        List<String> answer = new ArrayList<>();
	        for(int i=0; i<strArr.length;i++) {
	        	if(!strArr[i].contains("ad")) { //부분문자열 비교는 contains를 사용!!
	        		answer.add(strArr[i]);
	        	}
	        }
	        return answer;
	    }
}