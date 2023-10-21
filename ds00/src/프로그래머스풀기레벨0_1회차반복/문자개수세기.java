package 프로그래머스풀기레벨0_1회차반복;



public class 문자개수세기 {

	public static void main(String[] args) {
		Solution169 sol = new Solution169();
		String my_string = "";

		int[] answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution169 {
	 public int[] solution(String my_string) {
	        int[] answer = new int[52];
	        for (int i = 0; i < my_string.length(); i++) {
				char c = my_string.charAt(i);

				if (c >= 'A' && c <= 'Z') {
					answer[c - 'A']++;
				} else if (c >= 'a' && c <= 'z') {
					answer[26 + c - 'a']++;
				}
			}
	        return answer;
	    }
}