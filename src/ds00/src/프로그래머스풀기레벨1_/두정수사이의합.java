package 프로그래머스풀기레벨1_;



public class 두정수사이의합 {

	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		int a = 1; 
		int b = 1;

		long answer = sol.solution(a, b);
		System.out.println(answer);
	} 
}

class Solution13 {
	public long solution(int a, int b) {
        long answer = 0;
        if(a <= b){
            for(int i=a ;i<=b;i++){
                answer = answer + i;
            }
        }else {
            for(int i=b ;i<=a;i++){
                answer = answer + i;
            }
        }
        return answer;
    }
}