
package 프로그래머스풀기레벨0;
import java.util.*;

public class flag에따라다른값반환하기_8 {

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		int a = -4;
		int b = 7;
		boolean flag = false;
		int answer = sol.solution(a, b, flag);
		System.out.println(answer);

	}
}

class Solution8 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag ==true) {
        answer =a+b;
        }else {
        	answer =a-b;
        }
        return answer;
    }
}