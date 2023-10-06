package 프로그래머스풀기레벨0_1회차반복;

public class 짝수의합 {

	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution11 {
	public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                answer = answer + i;
            }
        }
        return answer;
    }
}