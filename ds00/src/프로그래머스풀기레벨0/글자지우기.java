package 프로그래머스풀기레벨0;


public class 글자지우기 {

	public static void main(String[] args) {
		Solution100 sol = new Solution100();
		String my_string = "apporoograpemmemprs";
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

		String answer = sol.solution(my_string, indices);
		System.out.println(answer);

	}
}  

class Solution100 {
	public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int index : indices) {
        	arr[index] = "";
        }
        answer = String.join("",arr);
        return answer;
    }
}