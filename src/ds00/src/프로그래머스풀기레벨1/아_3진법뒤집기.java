
package 프로그래머스풀기레벨1;


public class 아_3진법뒤집기 {

	public static void main(String[] args) {
		Solution24 sol = new Solution24();
		int n = 45;

		int answer = sol.solution(n);
		System.out.println(answer);

	}
}

class Solution24 {
	public int solution(int n) {
        int answer;
        String base3 = "";
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            base3 = (n % 3) + base3;
            n /= 3;
        }

        base3 = sb.append(base3).reverse().toString();

        answer = Integer.parseInt(base3, 3);

        return answer;
    }
}