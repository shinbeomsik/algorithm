
package 프로그래머스풀기레벨1;

import java.util.*;

public class 콜라츠추측_6 {

	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		int num = 6;

		int answer = sol.solution(num);
		System.out.println(answer);

	}
}

class Solution6 {
	public int solution(int num) {
		int answer = 0;
		if(num%2 ==0) {
			num = num/2;
		}
		return answer;
	}
}