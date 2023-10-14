package 프로그래머스풀기레벨0_1회차반복;



public class 등차수열의특정한항만더하기 {

	public static void main(String[] args) {
		Solution135 sol = new Solution135();
		int a = 1; 
		int d = 1;
		boolean[] included = {};

		int answer = sol.solution(a, d, included);
		System.out.println(answer);

	}
}

class Solution135 {
	public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for(int i=0;i<included.length;i++){
            if(included[i]){
                answer = answer + a + d*i;
            }
        }
        return answer;
    }
}