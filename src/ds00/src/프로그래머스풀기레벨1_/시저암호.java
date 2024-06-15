package 프로그래머스풀기레벨1_;


public class 시저암호 {

	public static void main(String[] args) {
		Solution36 sol = new Solution36();
		String s = " "; 
		int n = 1;

		String answer = sol.solution(s, n);
		System.out.println(answer);

	} 
}

class Solution36 {
	  public String solution(String s, int n) {
	        String answer = "";
	        
	        for(int i = 0; i < s.length(); i++){
	            int c = (int)s.charAt(i) + n;         
	            int div = 0;
	            
	            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
	                if(c > 90){
	                    c = c - 90;
	                    div = 64 + c;
	                    answer += Character.toString((char)div);
	                    continue;
	                }
	            }else if(s.charAt(i) >= 'a' && s.charAt(i) <='z'){
	                if(c > 122){
	                    c = c - 122;
	                    div = 96 + c;
	                    answer += Character.toString((char)div);
	                    continue;
	                }
	            }else if(s.charAt(i) == ' '){
	                answer += " ";
	                continue;
	            }
	            
	            answer += Character.toString((char)c);
	            
	        }
	        return answer;
	    }
}