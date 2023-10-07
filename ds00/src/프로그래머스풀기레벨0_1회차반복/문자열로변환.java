package 프로그래머스풀기레벨0_1회차반복;



public class 문자열로변환 {

	public static void main(String[] args) {
		Solution48 sol = new Solution48();
		int n = 70;

		String answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution48 {
	public String solution(int n) {
        String answer =n + "";
        
        //  String answer = Integer.toString(n); 이게 처리속도가 더 빠름
        return answer;
    }
}