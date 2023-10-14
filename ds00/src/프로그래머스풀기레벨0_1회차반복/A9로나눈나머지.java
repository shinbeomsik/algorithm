package 프로그래머스풀기레벨0_1회차반복;



public class A9로나눈나머지 {

	public static void main(String[] args) {
		Solution131 sol = new Solution131();
		String number = "";

		int answer = sol.solution(number);
		System.out.println(answer);

	}
}

class Solution131 {
	public int solution(String number) {
        int answer = 0;
        int k=0;
        String[] arr = number.split("");
         for(int i=0;i<arr.length;i++){
             k = k + Integer.parseInt(arr[i]);
         }
        answer = k%9;
        return answer;
    }
}