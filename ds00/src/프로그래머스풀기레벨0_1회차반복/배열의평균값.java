package 프로그래머스풀기레벨0_1회차반복;

public class 배열의평균값 {

	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		double answer = sol.solution(numbers);
		System.out.println(answer);

	}
}

class Solution12 {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i=0;i<numbers.length;i++){
            answer = answer + numbers[i];
        }
        answer = answer / numbers.length;
        return answer;
    }
}