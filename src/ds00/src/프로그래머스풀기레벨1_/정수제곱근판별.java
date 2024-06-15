package 프로그래머스풀기레벨1_;



public class 정수제곱근판별 {

	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		long n = 70;

		long answer = sol.solution(n);
		System.out.println(answer);
	} 
}

class Solution10 {
	public long solution(long n) {
        long answer = -1;
        double result  = Math.sqrt(n);
        if(result%1==0){
            answer = (long)Math.pow(result +1 , 2);
        }
        
        
        return answer;
    }
}