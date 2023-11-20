package 프로그래머스레벨1_1회차반복;


public class 짝수와홀수 {
}

class Solution2 {
    public String solution(int num) {
        String answer = "";
        if(num %2 ==0){
            answer = "Even";
        }else {
            answer = "Odd";
        }
        return answer;
    }
}