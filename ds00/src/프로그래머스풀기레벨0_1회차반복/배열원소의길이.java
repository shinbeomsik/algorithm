package 프로그래머스풀기레벨0_1회차반복;



public class 배열원소의길이 {

	public static void main(String[] args) {
		Solution27 sol = new Solution27();
		String[] strlist = {};

		int[] answer = sol.solution(strlist);
		System.out.println(answer);

	}
}

class Solution27 {
	public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i=0;i<strlist.length;i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}