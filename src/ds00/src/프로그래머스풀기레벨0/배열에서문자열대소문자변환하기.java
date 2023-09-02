
package 프로그래머스풀기레벨0;

import java.util.Arrays;

public class 배열에서문자열대소문자변환하기 {

	public static void main(String[] args) {
		Solution48 sol = new Solution48();
		String[] strArr = {"AAA","BBB","CCC","DDD"};

	    String[] answer = sol.solution(strArr);
		System.out.println(Arrays.toString(answer));

	}
}  

class Solution48 {
	 public String[] solution(String[] strArr) {
	        String[] answer = new String[strArr.length];
	        
	        for(int i=0; i<strArr.length;i++) {
	        	if(i%2 == 0) {
	        		answer[i] = strArr[i].toLowerCase();
	        	}else {
	        		answer[i] = strArr[i].toUpperCase();
	        	}
	        }
	        return answer;
	    }
}