package 프로그래머스풀기레벨0_1회차반복;



public class 인덱스바꾸기 {

	public static void main(String[] args) {
		Solution113 sol = new Solution113();
		String my_string = "";
		int num1  = 1;
		int num2  = 1;
		String answer = sol.solution(my_string, num1, num2);
		System.out.println(answer);

	}
}

class Solution113 {
	public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] arr = my_string.split("");
        String k = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = k;
        
        answer = String.join("",arr);
        return answer;
    }
}