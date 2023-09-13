package 프로그래머스풀기레벨0;


public class 문자열섞기 {

	public static void main(String[] args) {
		Solution89 sol = new Solution89();
		String str1 = "aaaaa"; 
		String str2 = "bbbbb";

		String answer = sol.solution(str1, str2);
		System.out.println(answer);

	}
}  

class Solution89 {
	public String solution(String str1, String str2) {
        String answer = "";
        String[] str1arr = str1.split("");
        String[] str2arr = str2.split("");
        
        for(int i=0;i<str1arr.length;i++) {
        	answer = answer + str1arr[i] + str2arr[i];
        }
        return answer;
    }
}