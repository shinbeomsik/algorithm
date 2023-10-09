package 프로그래머스풀기레벨0_1회차반복;



public class 주사위게임1 {

	public static void main(String[] args) {
		Solution86 sol = new Solution86();
		int a =0; 
		int b = 0;

		int answer = sol.solution(a, b);
		System.out.println(answer);

	}
}

class Solution86 {
	public int solution(int a, int b) {
        int answer = 0;
        if(a%2 !=0 && b%2 !=0){
            answer = a*a + b*b;
        }else if((a%2 ==0 && b%2 !=0) || (a%2 !=0 && b%2 ==0)){
            answer = 2*(a+b);
        }else{
            answer = Math.abs(a-b);
        }
        return answer;
    }
}