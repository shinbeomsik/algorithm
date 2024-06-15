package 프로그래머스레벨1_반복2;


public class 짝수와홀수 {
	
}

class Solution3 {
	public String solution(int num) {
        String answer = "";
        if(num % 2 ==0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        return answer;
    }
}