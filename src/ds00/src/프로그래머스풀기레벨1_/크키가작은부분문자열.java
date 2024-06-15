package 프로그래머스풀기레벨1_;


public class 크키가작은부분문자열 {

	public static void main(String[] args) {
		Solution33 sol = new Solution33();
		String t = ""; 
		String p = "";
		
		char k = 'k';
		int answer = sol.solution(t, p);
		System.out.println(answer);

	} 
}

class Solution33 {
	 public int solution(String t, String p) {
	        int answer = 0;
	        String k ="";
	        for(int i=0;i<t.length()-p.length()+1;i++){
	            k = t.substring(i, i+p.length());
	     
	            if(Long.parseLong(k) <= Long.parseLong(p)){
	                answer++;
	            }
	        }
	        return answer;
	    }
}