
package 프로그래머스풀기레벨0;

import java.util.Arrays;

public class 배열만들기1 {

	public static void main(String[] args) {
		Solution44 sol = new Solution44();
		int n = 10;
		int k = 3;

		int[] answer = sol.solution(n, k);
		System.out.println(answer);

	}
}  

class Solution44 {
	public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int index =0;
        for(int i=1; i<=n;i++) {
        	if(i%k*i == 0) {
        		answer[index++] = i;
        	}
        }
        return answer;
    }
}