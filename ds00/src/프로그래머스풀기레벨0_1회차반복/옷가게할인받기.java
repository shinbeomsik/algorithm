package 프로그래머스풀기레벨0_1회차반복;



public class 옷가게할인받기 {

	public static void main(String[] args) {
		Solution35 sol = new Solution35();
		int price = 70;

		int answer = sol.solution(price);
		System.out.println(answer);

	}
}

class Solution35 {
	public int solution(int price) {
        int answer = price;
        double a = 0 ;
        if(100000<= price && price < 300000){
            a = price*0.95;
            answer = (int)a;
        }else if(300000<=price && price < 500000){
            a = (int)price*0.9;
            answer = (int)a;
        }else if(500000<= price){
            a = (int)price*0.8;
            answer = (int)a;
        }
        return answer;
    }
}