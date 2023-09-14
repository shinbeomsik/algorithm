package 프로그래머스풀기레벨0;

public class 날짜비교하기 {

	public static void main(String[] args) {
		Solution94 sol = new Solution94();
		int[] date1 = { 2021, 12, 28 };
		int[] date2 = { 2021, 12, 29 };

		int answer = sol.solution(date1, date2);
		System.out.println(answer);

	}
}

class Solution94 {
	public int solution(int[] date1, int[] date2) {
		int answer = 0;
		if (date1[0] < date2[0]) {
			answer = 1;
		} else if (date1[0] == date2[0]) {
			if (date1[1] < date2[1]) {
				answer = 1;
			} else if(date1[1] == date2[1]) {
				if (date1[2] < date2[2]) {
					answer = 1;
				} else {
					answer =0;
				}
			}else {
				answer =0;
			}
		}else {
			answer = 0;
		}
		return answer;
	}
}