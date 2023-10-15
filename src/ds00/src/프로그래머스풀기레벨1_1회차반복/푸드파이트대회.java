package 프로그래머스풀기레벨1_1회차반복;


public class 푸드파이트대회 {

	public static void main(String[] args) {
		Solution41 sol = new Solution41();
		int[] food = {};

		String answer = sol.solution(food);
		System.out.println(answer);

	} 
}

class Solution41 {
	public String solution(int[] food) {
        String answer = "";
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                answer = answer + Integer.toString(i);
            }
        }
        answer = answer + Integer.toString(0);
        for(int i=food.length-1;i>=1;i--){
            for(int j=0;j<food[i]/2;j++){
                answer = answer + Integer.toString(i);
            }
        }
    
        return answer;
    }
}