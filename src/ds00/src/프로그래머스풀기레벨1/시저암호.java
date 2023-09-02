
package 프로그래머스풀기레벨1;

import java.util.*;

public class 시저암호 {

	public static void main(String[] args) {
		Solution30 sol = new Solution30();
		int n = 1;
		String s ="AB";
		
		String answer = sol.solution(s, n);
		System.out.println(answer);

	} 
}

class Solution30 {
	public String solution(String s, int n) {
		char[] arr = new char[s.length()];
        arr = s.toCharArray();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < s.length(); j++){
                if(arr[j] == ' ') {
                	continue; // 만약 띄어쓰기가있으면 그냥 진행되도록한다.
                } // z OR Z 에 1을 더하면 이상하지기 때문에 아스키코드인 26을 뺴줘야한다.
                else if(arr[j] == 'z' || arr[j] == 'Z') {
                	arr[j] -= 26;
                }
                arr[j] += 1;
            }
        }

        String answer = new String(arr);
        return answer;
    }
}