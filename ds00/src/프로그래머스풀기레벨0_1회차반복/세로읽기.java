package 프로그래머스풀기레벨0_1회차반복;



public class 세로읽기 {

	public static void main(String[] args) {
		Solution136 sol = new Solution136();
		String my_string = "";
		int m  = 1;
		int c = 1;

		String answer = sol.solution(my_string, m, c);
		System.out.println(answer);

	}
}

class Solution136 {
	public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i=0;i<arr.length;i = i+m){
            answer = answer + arr[i+c-1];
        }
        return answer;
    }
}