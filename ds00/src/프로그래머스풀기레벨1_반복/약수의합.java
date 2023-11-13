package 프로그래머스풀기레벨1_반복;



public class 약수의합 {

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution5 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer = answer+i;
            }
        }
        return answer;
    }
}