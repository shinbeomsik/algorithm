package 프로그래머스레벨1_반복;


public class 콜라문제 {
	
}

class Solution66 {
	public int solution(int a, int b, int n) {
        int answer = 0;
        int c =0;
        while(n >= a){
            answer = answer + (n/a)*b;
            c = n%a;
            n = c + (n/a)*b  ;
        }
        return answer;
    }
}