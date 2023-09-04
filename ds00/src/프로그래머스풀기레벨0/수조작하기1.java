
package 프로그래머스풀기레벨0;

import java.util.*;
public class 수조작하기1 {

	public static void main(String[] args) {
		Solution35 sol = new Solution35();
		int n = 0;
		String control = "wsdawsdassw";

		int answer = sol.solution(n, control);
		System.out.println(answer);

	}
}

class Solution35 {
	public int solution(int n, String control) {
        int answer = 0;
        char[] arr = control.toCharArray();
        for(int i=0;i<arr.length;i++) {
        	if(arr[i] == 'w') {
        		answer = answer + 1;
        	}else if(arr[i]== 's') {
        		answer = answer -1;
        	}else if(arr[i] =='d') {
        		answer = answer +10;
        	}else if(arr[i] == 'a') {
        		answer = answer-10;
        	}
        }
        return answer+n;
    }
}