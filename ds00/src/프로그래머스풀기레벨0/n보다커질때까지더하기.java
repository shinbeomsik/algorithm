
package 프로그래머스풀기레벨0;
import java.util.*;

public class n보다커질때까지더하기 {

	public static void main(String[] args) {
		Solution21 sol = new Solution21();
		int n = 139;
		int[] numbers = {58, 44, 27, 10, 100};
		int answer = sol.solution(numbers, n);
		System.out.println(answer);

	}
}

class Solution21 {
	public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i=0; i <numbers.length;i++) {
        	answer = answer + numbers[i];
        	if(answer > n) {
        		break;
        	}
        }
        return answer;
    }
}