package 프로그래머스풀기레벨0_1회차반복;

import java.util.*;
public class 옹알이1 {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

		int answer = sol.solution(babbling);
		System.out.println(answer);

	}
}

class Solution1 {
	public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0;i<babbling.length;i++) {
        	babbling[i] = babbling[i].replace("aya" , " ");
        	babbling[i] = babbling[i].replace("ye" , " ");
        	babbling[i] = babbling[i].replace("woo" , " ");
        	babbling[i] = babbling[i].replace("ma" , " ");
        }	
        
        
        for(int i=0;i<babbling.length;i++) {
        	if(babbling[i].trim().equals("")) {
        		answer++;
        	}
        }
        
        return answer;
    }
}