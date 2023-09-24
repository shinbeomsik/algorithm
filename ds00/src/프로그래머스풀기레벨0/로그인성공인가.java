package 프로그래머스풀기레벨0;

import java.util.*;

public class 로그인성공인가 {

	public static void main(String[] args) {
		Solution143 sol = new Solution143();
		String[] id_pw = { "abc04", "555" };
		String[][] db = { { "abc04", "345" }, { "abc04", "335" }, { "abc03", "345" } };

		String answer = sol.solution(id_pw, db);
		System.out.println(answer);

	}
}

class Solution143 {
	public String solution(String[] id_pw, String[][] db) {
		String answer = "";
		for (int i = 0; i < db.length; i++) {
			String aaaa = "";
			if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
				answer = "login";
				break;
			} else if (id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
				answer = "wrong pw";
				aaaa = "wrong pw";
			} else if (!id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
				if(!aaaa.equals("wrong pw")) {
					answer = "fail";
				}
			}
		}
		return answer;
	}
}