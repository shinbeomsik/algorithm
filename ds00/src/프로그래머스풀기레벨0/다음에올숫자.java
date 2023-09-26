package 프로그래머스풀기레벨0;


public class 다음에올숫자 {

	public static void main(String[] args) {
		Solution153 sol = new Solution153();
		int[] common = {4, 16, 64};

		int answer = sol.solution(common);
		System.out.println(answer);

	}
}  

class Solution153 {
	public int solution(int[] common) {
        int answer = 0;
        
        if((common[1] - common[0]) == (common[2] - common[1])){
        	answer = common[common.length-1] +  (common[1] - common[0]);
        }else {
        	answer = common[common.length-1] *  (common[1]/ common[0]);
        }
       
        return answer;
    }
}