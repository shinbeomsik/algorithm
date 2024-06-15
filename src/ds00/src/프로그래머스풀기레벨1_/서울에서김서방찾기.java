package 프로그래머스풀기레벨1_1회차반복;



public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		Solution15 sol = new Solution15();
		String[] seoul = {};

		String answer = sol.solution(seoul);
		System.out.println(answer);
	} 
}

class Solution15 {
	  public String solution(String[] seoul) {
	        String answer = "";
	        for(int i=0;i<seoul.length;i++){
	            if(seoul[i].equals("Kim")){
	                answer = "김서방은 " + i + "에 있다";
	            
	            }
	        }
	        return answer;
	    }
}