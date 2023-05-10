
package 프로그래머스풀기레벨1;
import java.util.*;

public class 평균구하기_2 {

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr = {5,5};

		double answer = sol.solution(arr);
		System.out.println(answer);

	}
}

class Solution2 {
    public double solution(int[] arr) {
        double answer = 0;
        int count = 0;
        for (int x : arr) {
			count +=x;
		}
        answer = (double)count/arr.length;
        return answer;
    }
}