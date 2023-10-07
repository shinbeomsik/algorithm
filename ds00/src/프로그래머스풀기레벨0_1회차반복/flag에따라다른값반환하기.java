package 프로그래머스풀기레벨0_1회차반복;



public class flag에따라다른값반환하기 {

	public static void main(String[] args) {
		Solution49 sol = new Solution49();
		int a= 70;
		int b= 70;
		boolean flag= true;

		int answer = sol.solution(a, b, flag);
		System.out.println(answer);

	}
}

class Solution49 {
	public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag == true){
            answer = a + b; 
        }else{
            answer = a - b;
        }
        return answer;
    }
}