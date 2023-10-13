package 프로그래머스풀기레벨0_1회차반복;



public class 수조작하기2 {

	public static void main(String[] args) {
		Solution127 sol = new Solution127();
		int[] numLog = {};

		String answer = sol.solution(numLog);
		System.out.println(answer);

	}
}

class Solution127 {
	public String solution(int[] numLog) {
        String answer = "";
        for(int i=1;i<numLog.length;i++){
            if((numLog[i] - numLog[i-1]) == 1 ){
                answer = answer + "w";
            }else if((numLog[i] - numLog[i-1]) == -1 ){
                answer = answer + "s";
            } else if((numLog[i] - numLog[i-1]) == 10 ){
                answer = answer + "d";
            } else {
                answer = answer + "a";
            }
        }
        return answer;
    }
}