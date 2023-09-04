
package 프로그래머스풀기레벨0;

import java.util.*;

public class 홀짝에따라다른값반환하기 {

	public static void main(String[] args) {
		Solution9 sol = new Solution9();
		int n = 10;

			
		Scanner sc = new Scanner(System.in);
		
		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution9 {
	public int solution(int n) {
		int answer = 0;
		if(n%2==0) {
			for(int i=0; i<=n;i =i+2) {
				answer = answer +i*i ;
			}
		}else {
			for(int i=1;i<=n;i =i+2) {
				answer = answer + i;
			}
		}
		return answer;
	}
}

