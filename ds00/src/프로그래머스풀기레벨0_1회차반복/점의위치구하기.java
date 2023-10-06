package 프로그래머스풀기레벨0_1회차반복;

public class 점의위치구하기 {

	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		int[] dot = {3,2};

		int answer = sol.solution(dot);
		System.out.println(answer);

	}
}

class Solution14 {
	 public int solution(int[] dot) {
	        int answer = 0;
	        int x = dot[0];
	        int y = dot[1];
	        if(x > 0 && y > 0){
	            answer = 1;
	        }else if(x > 0 && y< 0){
	            answer = 4;
	        }else if(x <0 && y >0){
	            answer = 2;
	        }else {
	            answer =3;
	        }
	        return answer;
	    }
}