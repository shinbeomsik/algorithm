package 프로그래머스풀기레벨1_반복;



public class 문자열을정수로바꾸기 {

	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		String s = "";

		int answer = sol.solution(s);
		System.out.println(answer);

	}
}

class Solution6 {
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }
}