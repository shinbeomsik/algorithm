package 프로그래머스풀기레벨0;

public class 외계어사전 {

	public static void main(String[] args) {
		Solution135 sol = new Solution135();
		String[] spell = { "z", "d", "x " };
		String[] dic = { "def", "dww", "dzx", "loveaw" };

		int answer = sol.solution(spell, dic);
		System.out.println(answer);

	}
}

class Solution135 {
	public int solution(String[] spell, String[] dic) {
		int answer = 0;
		for (int i = 0; i < dic.length; i++) {
			int cnt = 0;
			for (int j = 0; j < spell.length; j++) {
				if (dic[i].indexOf(spell[j]) == -1) {
					cnt = 1;
					answer = 2;
					break;
				}
			}
			if (cnt == 0) {
				answer = 1;
				break;
			}
		}

		return answer;
	}
}