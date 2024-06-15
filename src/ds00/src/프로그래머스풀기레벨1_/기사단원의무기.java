package 프로그래머스풀기레벨1_;


public class 기사단원의무기 {

	public static void main(String[] args) {
		Solution51 sol = new Solution51();
		int number = 1;
		int limit =1;
		int power =1;

		int answer = sol.solution(number, limit, power);
		System.out.println(answer);

	} 
}

class Solution51 {
	public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                arr[j]++;
            }
        }

        for (int i = 1; i <= number; i++) {
            if (arr[i] <= limit) {
                answer += arr[i];
            } else {
                answer += power;
            }
        }
        return answer;
    }
}