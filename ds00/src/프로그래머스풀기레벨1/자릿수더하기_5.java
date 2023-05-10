
package 프로그래머스풀기레벨1;
import java.util.*;

public class 자릿수더하기_5 {

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		int n = 789;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution5 {
    public int solution(int n) {
        int answer = 0;
        String a = n+"";
        String[] arr = a.split("");
         for(int i =0; i<arr.length;i++) {
        	 answer = answer + Integer.parseInt(arr[i]);
          }
        return answer;
    }
}