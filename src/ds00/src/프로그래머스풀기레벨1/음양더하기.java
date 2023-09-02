
package 프로그래머스풀기레벨1;

import java.util.*;

public class 음양더하기 {

	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		int[] absolutes = {1,2,3};
		boolean[] signs = {false,false,true};
		int answer = sol.solution(absolutes, signs);
		System.out.println(answer);

	}
}

class Solution13 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<signs.length;i++) {
        	if(signs[i]==false) {
        		absolutes[i] = -absolutes[i]; 
        	}
        }
        
        for(int i=0; i<signs.length;i++) {
        	answer = answer + absolutes[i];
        }
        return answer;
    }
}