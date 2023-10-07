package 프로그래머스풀기레벨0_1회차반복;

public class 아이스아메리카노 {

	public static void main(String[] args) {
		Solution26 sol = new Solution26();
		int money = 70;

		int[] answer = sol.solution(money);
		System.out.println(answer);

	}
}

class Solution26 {
	 public int[] solution(int money) {
	        int[] answer = new int[2];
	        answer[0] = money/5500;
	        answer[1] = money%5500;
	        
	        return answer;
	    }
}