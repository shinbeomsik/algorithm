package 프로그래머스풀기레벨0;


public class 옹알이1 {

	public static void main(String[] args) {
		Solution161 sol = new Solution161();
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

		int answer = sol.solution(babbling);
		System.out.println(answer);

	}
}  

class Solution161 {
	 public int solution(String[] babbling) {
	        int answer = 0;
	        
	        for(int i=0;i<babbling.length;i++) {
	        	babbling[i]	= babbling[i].replace("aya", " ");
	        	babbling[i]	= babbling[i].replace("ye", " ");
	        	babbling[i]	= babbling[i].replace("woo", " ");
	        	babbling[i]	= babbling[i].replace("ma", " ");
	        	
	        	if(babbling[i].trim().equals("")) { 
	        		answer++;
	        	}
	        }
	        return answer;
	    }
}