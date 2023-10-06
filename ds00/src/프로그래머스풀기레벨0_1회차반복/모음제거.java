package 프로그래머스풀기레벨0_1회차반복;

public class 모음제거 {

	public static void main(String[] args) {
		Solution22 sol = new Solution22();
		String my_string=  "";

		String answer = sol.solution(my_string);
		System.out.println(answer);

	}
}

class Solution22 {
	public String solution(String my_string) {
        String answer = my_string.replace("a","").replace("i","").replace("e","").replace("o","").replace("u","");
        return answer;
    }
}