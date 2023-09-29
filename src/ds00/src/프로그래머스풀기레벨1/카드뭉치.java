
package 프로그래머스풀기레벨1;

import java.util.*;

public class 카드뭉치 {

	public static void main(String[] args) {
		Solution41 sol = new Solution41();
		String[] cards1 = { "i", "water", "drink" };
		String[] cards2 = { "want", "to" };
		String[] goal = { "i", "want", "to", "drink", "water" };

		String answer = sol.solution(cards1, cards2, goal);
		System.out.println(answer);

	}
}

class Solution41 {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "";

		int w = 0;
		int y = 0;

		for (int i = 0; i < goal.length; i++) {
			if (cards1.length > w &&goal[i].equals(cards1[w])) {
				w++;
			} 
			if (cards2.length > y &&goal[i].equals(cards2[y])) {
				y++;
			}
		}
		
		if(w+y == goal.length) {
			answer = "Yes";
		}else {
			answer = "No";
		}
		
		

		return answer;
	}
}