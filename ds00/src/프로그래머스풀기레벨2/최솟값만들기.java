package 프로그래머스풀기레벨2;

import java.util.*;

public class 최솟값만들기 {

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] A = {1,4,2};
		int[] B = {5,4,4};
				
		int answer = sol.solution(A, B);
		System.out.println(answer);

	}
}

class Solution2 {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i=0; i<A.length;i++) {
			answer = answer + A[i]*B[A.length-i -1];
		}
		return answer;
	}
}