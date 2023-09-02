
package 프로그래머스풀기레벨1;

import java.util.*;

public class 예산 {

	public static void main(String[] args) {
		Solution26 sol = new Solution26();
		int[] d= {2,2,3,3};
		int budget = 10;
		int answer = sol.solution(d, budget);
		System.out.println(answer);

	}
}

class Solution26 {
	public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum =0;
        for(int i=0;i<d.length;i++) {
        	if(sum+d[i]>budget) {
        		break;
        	}else {
        		sum = sum + d[i];
        		answer++;
        	}
        }
        return answer;
    }
}