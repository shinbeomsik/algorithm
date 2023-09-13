package 프로그래머스풀기레벨0;


public class 합성수찾기 {

	public static void main(String[] args) {
		Solution88 sol = new Solution88();
		int n = 10;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}  

class Solution88 {
	public static int solution(int n) {
        int answer = 0;

        for(int i = 2; i <= n; i++){
        	for(int j = 2; j < i ; j++) {
        		if(i % j == 0) {
			        answer++;
			        break;
		        }
        	}
        }

        return answer;
    }
}