package 프로그래머스풀기레벨0_1회차반복;



public class 배열의유사도 {

	public static void main(String[] args) {
		Solution34 sol = new Solution34();
		String[] s1 = {}; 
		String[] s2 = {};

		int answer = sol.solution(s1, s2);
		System.out.println(answer);

	}
}

class Solution34 {
	 public int solution(String[] s1, String[] s2) {
	        int answer = 0;
	        for(int i=0;i<s1.length;i++){
	            for(int j=0;j<s2.length;j++)
	                if(s1[i].equals(s2[j])){
	                    answer++;
	                }
	        }
	        return answer;
	    }
}