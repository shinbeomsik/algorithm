package 프로그래머스풀기레벨0_1회차반복;



public class 간단한식계산하기 {

	public static void main(String[] args) {
		Solution123 sol = new Solution123();
		String binomial = "";

		int answer = sol.solution(binomial);
		System.out.println(answer);

	}
}

class Solution123 {
	public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" ");
        
        if(arr[1].equals("+")){
            answer = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
        }else if(arr[1].equals("-")){
            answer = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
        }else{
            answer = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
        }
        return answer;
    }
}