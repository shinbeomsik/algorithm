package 프로그래머스풀기레벨0;


public class 문자열겹쳐쓰기 {

	public static void main(String[] args) {
		Solution139 sol = new Solution139();
		String my_string = "He11oWor1d";
		String overwrite_string = "lloWorl";
		int s =2;

		String answer = sol.solution(my_string, overwrite_string, s);
		System.out.println(answer);

	}
}  

class Solution139 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String[] arr = my_string.split("");
       	String[] brr = overwrite_string.split("");
       	
       	for(int i=0;i<overwrite_string.length();i++) {
       		arr[s+i] = brr[i];
       	}
       	answer = String.join("",arr);
        return answer;
    }
}