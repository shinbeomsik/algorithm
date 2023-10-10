package 프로그래머스풀기레벨1_1회차반복;



public class 가운데글자가져오기 {

	public static void main(String[] args) {
		Solution21 sol = new Solution21();
		String s = "";

		String answer = sol.solution(s);
		System.out.println(answer);
	} 
}

class Solution21 {
	public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        if(s.length()%2 ==0){
            answer = arr[s.length()/2-1] + arr[s.length()/2];
        }else{
            answer = arr[s.length()/2];
        }
        return answer;
    }
}