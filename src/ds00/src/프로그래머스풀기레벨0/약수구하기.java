
package 프로그래머스풀기레벨0;

import java.util.*;

public class 약수구하기 {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		int n = 24;

		int[] answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution1 {
    public int[] solution(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=1; i<=n;i++) {
        	if(n%i ==0) {
        		a.add(i);
        	}
        }
        int[] answer = new int[a.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i]= a.get(i);
		}
        return answer;
    }
}