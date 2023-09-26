package 프로그래머스풀기레벨0;


public class 코드처리하기 {

	public static void main(String[] args) {
		Solution150 sol = new Solution150();
		String code = "abcd1abcd";

		String answer = sol.solution(code);
		System.out.println(answer);

	}
}  

class Solution150 {
	public String solution(String code) {
        String answer = "";
        String[] codearr = code.split("");
        
        int mode = 0;
        
        for(int i=0;i<codearr.length;i++) {
        	if(mode == 0) {
        		if(!codearr[i].equals("1") && i%2 ==0) {
        			answer = answer + codearr[i];
        		}else if(codearr[i].equals("1")) {
        			mode = 1;
        		}
        	}else if(mode ==1) {
        		if(!codearr[i].equals("1") && i%2 !=0) {
        			answer = answer + codearr[i];
        		}else if(codearr[i].equals("1")) {
        			mode = 0;
        		}
        	}
        	
        }
        
        if(answer.equals("")) {
        	answer = "EMPTY";
        }
        
        return answer;
    }
}