package 프로그래머스풀기레벨0;


public class 팩토리얼 {

	public static void main(String[] args) {
		Solution99 sol = new Solution99();
		int n = 3628800;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}  

class Solution99 {
	public int solution(int n) {
        int answer = 0;
        int i =1;
        int sum =1;
        while(true) {
        	i++;
        	sum =sum * i;
        	if(sum>n) {
        		answer = i-1;
        		break;
        	}
        }
        return answer;
    }
}