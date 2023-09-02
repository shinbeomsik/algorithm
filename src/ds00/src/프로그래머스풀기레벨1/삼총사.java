
package 프로그래머스풀기레벨1;


public class 삼총사 {

	public static void main(String[] args) {
		Solution27 sol = new Solution27();
		int[] number = {-3, -2, -1, 0, 1, 2, 3};

		int answer = sol.solution(number);
		System.out.println(answer);

	}
}

class Solution27 {
	public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
			for (int j = i+1; j < number.length; j++) {
				for (int k = j+1; k < number.length; k++) {
					if(number[i] + number[j] +number[k] ==0) {
						answer++;
					}
				}
			}
		}
        return answer;
    }
}