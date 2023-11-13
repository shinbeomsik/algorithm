package 프로그래머스풀기레벨1_반복;



public class 짝수와홀수 {

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int num = 70;

		String answer = sol.solution(num);
		System.out.println(answer);

	}
}

class Solution2 {
    public String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer = "Even";
        }else {
            answer = "Odd";
        }
        return answer;
    }
}