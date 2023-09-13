package 프로그래머스풀기레벨0;


public class 등차수열의특정한항만더하기 {

	public static void main(String[] args) {
		Solution90 sol = new Solution90();
		int a = 7;
		int d = 1; 
		boolean[] included = {false, false, false, true, false, false, false};

		int answer = sol.solution(a, d, included);
		System.out.println(answer);

	}
}  

class Solution90 {
	public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(int i=0; i<included.length;i++) {
        	if(included[i] ==true) {
        		answer = answer + (a + d*i);
        	}
        }
        return answer;
    }
}