package 프로그래머스풀기레벨1_;


public class 옹알이2 {

	public static void main(String[] args) {
		Solution54 sol = new Solution54();
		String[] babbling = {};

		int answer = sol.solution(babbling);
		System.out.println(answer);

	} 
}

class Solution54 {
	 public int solution(String[] babbling) {
	        int answer = 0;
	        for(int i=0;i<babbling.length;i++){
	            babbling[i] = babbling[i].replaceAll("ayaaya","x");
	            babbling[i] = babbling[i].replaceAll("yeye","x");
	            babbling[i] = babbling[i].replaceAll("woowoo","x");
	            babbling[i] = babbling[i].replaceAll("mama","x");
	        }
	        for(int i=0;i<babbling.length;i++){
	            babbling[i] = babbling[i].replaceAll("aya"," ");
	            babbling[i] = babbling[i].replaceAll("ye"," ");
	            babbling[i] = babbling[i].replaceAll("woo"," ");
	            babbling[i] = babbling[i].replaceAll("ma"," ");
	        }
	        
	        for(int i=0;i<babbling.length;i++){
	            if(babbling[i].trim().length()==0){
	                answer++;
	            }
	        }
	        return answer;
	    }
}