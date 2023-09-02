
package 프로그래머스풀기레벨0;

public class 글자이어붙여문자열만들기 {

	public static void main(String[] args) {
		Solution37 sol = new Solution37();
		String my_string ="cvsgiorszzzmrpaqpe"; 
		int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

		String answer = sol.solution(my_string, index_list);
		System.out.println(answer);

	}
}

class Solution37 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] arr = my_string.split("");
        String[] brr = new String[index_list.length];
        for(int i=0; i<index_list.length;i++) {
        	brr[i] =arr[index_list[i]];
        }
        answer = String.join("",brr);
        return answer;
    }
}