package 프로그래머스풀기레벨0;


public class 문자열밀기 {

	public static void main(String[] args) {
		Solution148 sol = new Solution148();
		String A ="hello"; 
		String B ="ohell";

		int answer = sol.solution(A, B);
		System.out.println(answer);

	}
}  

class Solution148 {
	public int solution(String A, String B) {
        int answer = 0;
        String copy = A;

        for (int i = 0; i < A.length(); i++) {
            if (copy.equals(B)) {
                return answer;
            }

            String a = copy.substring(copy.length() - 1);
            copy = a + copy.substring(0, copy.length() - 1);
            answer++;
        }

        return -1;
    }
}