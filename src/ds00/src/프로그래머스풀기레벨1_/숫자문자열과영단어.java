package 프로그래머스풀기레벨1_;


public class 숫자문자열과영단어 {

	public static void main(String[] args) {
		Solution37 sol = new Solution37();
		String s = "";

		int answer = sol.solution(s);
		System.out.println(answer);

	} 
}

class Solution37 {
	public int solution(String s) {
        int answer = 0;
        s = s.replaceAll("zero" , "0")
             .replaceAll("one","1")
             .replaceAll("two","2")
             .replaceAll("three","3")
             .replaceAll("four","4")
             .replaceAll("five","5")
             .replaceAll("six","6")
             .replaceAll("seven","7")
             .replaceAll("eight","8")
             .replaceAll("nine","9");
        
        answer = Integer.parseInt(s);
            
        return answer;
    }
}