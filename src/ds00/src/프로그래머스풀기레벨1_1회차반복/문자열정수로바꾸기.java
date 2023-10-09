package 프로그래머스풀기레벨1_1회차반복;



public class 문자열정수로바꾸기 {

	public static void main(String[] args) {
		Solution9 sol = new Solution9();
		String s = "";

		int answer = sol.solution(s);
		System.out.println(answer);
	} 
}

class Solution9 {
	public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");
        if(arr[0] == "-"){
            answer = -Integer.parseInt(s);
        }else{
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}