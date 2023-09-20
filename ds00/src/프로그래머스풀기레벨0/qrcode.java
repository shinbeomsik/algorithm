package 프로그래머스풀기레벨0;


public class qrcode {

	public static void main(String[] args) {
		Solution123 sol = new Solution123();
		int q = 3;
		int r =  1;
		String code = "qjnwezgrpirldywt";

		String answer = sol.solution(q, r, code);
		System.out.println(answer);

	}
}  

class Solution123 {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] codearr = code.split("");
        for(int i=0;i<codearr.length;i++) {
        	if(i%q == r) {
        		answer = answer + codearr[i];
        		
        	}
        }
        return answer;
    }

}