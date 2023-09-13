package 프로그래머스풀기레벨0;


public class a9로나눈나머지 {

	public static void main(String[] args) {
		Solution83 sol = new Solution83();
		String number = "78720646226947352489";

		int answer = sol.solution(number);
		System.out.println(answer);

	}
}  

class Solution83 {
	public int solution(String number) {
        int answer = 0;
        String[] arr = number.split("");
        for(int i=0; i < arr.length;i++) {
        	answer = answer + Integer.parseInt(arr[i]);
        }
        answer = answer%9;
        return answer;
    }
}