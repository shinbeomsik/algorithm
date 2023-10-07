package 프로그래머스풀기레벨1;

public class 옹알이2 {

	public static void main(String[] args) {
		Solution52 sol = new Solution52();
		String[] babbling = { "ayeyeya" };

		int answer = sol.solution(babbling);
		System.out.println(answer);

	}
}

class Solution52 {
	public int solution(String[] babbling) {
		int answer = 0;
		for (int i = 0; i < babbling.length; i++) {
			babbling[i] = babbling[i].replace("ayaaya", "x");
			babbling[i] = babbling[i].replace("yeye", "x");
			babbling[i] = babbling[i].replace("woowoo", "x");
			babbling[i] = babbling[i].replace("mama", "x");

		}
		for (int i = 0; i < babbling.length; i++) {
			babbling[i] = babbling[i].replace("aya", " ");
			babbling[i] = babbling[i].replace("ye", " ");
			babbling[i] = babbling[i].replace("woo", " ");
			babbling[i] = babbling[i].replace("ma", " ");

		}
		for (int i = 0; i < babbling.length; i++) {
			if (babbling[i].trim().equals("")) {
				answer++;
			}
		}
		return answer;
	}
}
//for(String b : babbling) {
//	b = b.replaceAll("ayaaya|yeye|woowoo|mama", "x");
//	b = b.replaceAll("aya|ye|woo|ma", "");
//	if("".equals(b)) answer++;
//}
//
//for (int i = 0; i < babbling.length; i++) {
//	babbling[i] = babbling[i].replace("ayaaya", "x");
//	babbling[i] = babbling[i].replace("yeye", "x");
//	babbling[i] = babbling[i].replace("woowoo", "x");
//	babbling[i] = babbling[i].replace("mama", "x");
//	
//}
//for (int i = 0; i < babbling.length; i++) {
//	babbling[i] = babbling[i].replace("aya", "");
//	babbling[i] = babbling[i].replace("ye", "");
//	babbling[i] = babbling[i].replace("woo", "");
//	babbling[i] = babbling[i].replace("ma", "");
//	
//}
//for (int i = 0; i < babbling.length; i++) {
//	if (babbling[i].equals("")) {
//		answer++;
//	}
//}