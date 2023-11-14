package 프로그래머스풀기레벨1_반복;



public class 자릿수더학기 {

	public static void main(String[] args) {
		Solution9 sol = new Solution9();
		int n = 70;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution9 {
    public int solution(int n) {
        int answer = 0;
    
        String k = Integer.toString(n);
        String[] arr = k.split("");
        
        for(int i=0;i<arr.length;i++){
            answer = answer + Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}