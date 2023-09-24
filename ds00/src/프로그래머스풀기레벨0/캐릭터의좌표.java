package 프로그래머스풀기레벨0;

import java.util.*;

public class 캐릭터의좌표 {

	public static void main(String[] args) {
		Solution142 sol = new Solution142();
		String[] keyinput = {"left", "left", "left", "left", "right", "right", "right", "right"};
		int[] board = {5,5};

		int[] answer = sol.solution(keyinput, board);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution142 {
	public int[] solution(String[] keyinput, int[] board) {
		int[] answer = new int[2];

		for (int i = 0; i < keyinput.length; i++) {
			if (keyinput[i].equals("left")) {
				answer[0]--;
			} else if (keyinput[i].equals("right")) {
				answer[0]++;
			} else if (keyinput[i].equals("up")) {
				answer[1]++;
			} else if (keyinput[i].equals("down")) {
				answer[1]--;
			}
			if (answer[0] > 0) {
				if (answer[0] > board[0] / 2) {
					answer[0] = board[0]/2;
				}
			}else if(answer[0]<0) {
				if(Math.abs(answer[0]) > board[0]/2) {
					answer[0] = -board[0]/2;
				}
			}
			if (answer[1] > 0) {
				if (answer[1] > board[1] / 2) {
					answer[1] = board[1]/2;
				}
			}else if(answer[1]<0) {
				if(Math.abs(answer[1]) > board[1]/2) {
					answer[1] = -board[1]/2;
				}
			}
		}
		return answer;
	}
}