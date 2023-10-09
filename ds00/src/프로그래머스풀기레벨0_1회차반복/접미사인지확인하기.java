package 프로그래머스풀기레벨0_1회차반복;



public class 접미사인지확인하기 {

	public static void main(String[] args) {
		Solution89 sol = new Solution89();
		String my_string = "banana"; 
		String is_suffix = "banana";

		int answer = sol.solution(my_string, is_suffix);
		System.out.println(answer);

	}
}

class Solution89 {
	public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.length() >= is_suffix.length() && my_string.substring((my_string.length()) - (is_suffix.length()) ,my_string.length()).equals(is_suffix)){
            answer = 1;
        }
        return answer;
    }
}