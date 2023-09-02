
package 프로그래머스풀기레벨1;


public class 부족한금액계산하기 {

	public static void main(String[] args) {
		Solution19 sol = new Solution19();
		int price = 3;
		int money = 20;
		int count = 4;

		long answer = sol.solution(price, money, count);
		System.out.println(answer);

	}
}

class Solution19 {
	public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        for(int i=1; i<=count ; i++) {
        	total = total+ price*i ;
        }
        if(money - total < 0) {
        	answer = total - money;
        }
        return answer;
    }
}