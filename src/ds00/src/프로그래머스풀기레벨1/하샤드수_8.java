
package 프로그래머스풀기레벨1;

import java.util.*;

public class 하샤드수_8 {

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		int x = 11;

		boolean answer = sol.solution(x);
		System.out.println(answer);

	}
}

class Solution8 {
	public boolean solution(int x) {
        boolean answer = true;
        String s = Integer.toString(x);
        int y = 0;
        for(int i=0; i<s.length(); i++){
            y = y+ Integer.parseInt(s.substring(i, i+1));
        }
        if (x%y ==0) {
			answer = true;
		} else {
			answer =false;
		}
        return answer;
    }
}