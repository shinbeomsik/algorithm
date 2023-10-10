package 프로그래머스풀기레벨1_1회차반복;



public class 없는숫자더하기 {

	public static void main(String[] args) {
		Solution19 sol = new Solution19();
		int[] numbers = { 70};

		int answer = sol.solution(numbers);
		System.out.println(answer);
	} 
}

class Solution19 {
    public int solution(int[] numbers) {
        int answer =  45;
        
        for(int i=0;i<numbers.length;i++){
            answer = answer -numbers[i];
        }
        return answer;
    }
}