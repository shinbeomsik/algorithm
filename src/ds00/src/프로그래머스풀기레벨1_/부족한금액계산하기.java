package 프로그래머스풀기레벨1_;



public class 부족한금액계산하기 {

	public static void main(String[] args) {
		Solution25 sol = new Solution25();
		int price = 1;
		int money = 1;
		int count = 1;

		long answer = sol.solution(price, money, count);
		System.out.println(answer);
	} 
}

class Solution25 {
	public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i=1;i<=count;i++){
            answer = answer + price*i;
        }
        if(answer>money){
        answer = answer - money;
        }else{
            answer = 0;
        }
        return answer;
    }
}