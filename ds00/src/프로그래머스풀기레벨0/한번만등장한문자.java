package 프로그래머스풀기레벨0;

import java.util.*;
public class 한번만등장한문자 {

	public static void main(String[] args) {
		Solution113 sol = new Solution113();
		String s = "abcabcadc";

		String answer = sol.solution(s);
		System.out.println(answer);

	}
}  

class Solution113 {
	public static String solution(String s) {
        String answer = "";
        
        // 알파벳 개수만큼 배열을 만든다, 알파벳 위치에 해당하는 문자가 등장하면 인덱스를 1증가시킨다
        int[] alphabet = new int[26];
        
        // 모든 값을 0으로 초기화
        for(int i = 0; i < alphabet.length; i++) {
        	alphabet[i] = 0;
        }
        
        // 핵심코드
        // 알파벳 소문자만 사용되므로 아스키코드를 이용하여 -97을 해주어 해당문자의 위치값을 구함
        for(int i = 0; i < s.length(); i++) {
        	alphabet[s.charAt(i) - 97] += 1;
        }
        
        for(int i = 0; i < alphabet.length; i++) {
        	// 한번만 등장한 문자이면 배열의 카운트가 1이므로,
        	if(alphabet[i] == 1) {
        		
        		// 다시 해당문자를 아스키코드만큼 더해서 char 형변환으로 저장한다.
        		answer += (char)(i + 97);
        	}
        }
        return answer;
    }
}