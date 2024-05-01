package 프로그래머스레벨1_반복4;


public class 없는숫자더하기 {
	   
}

class Solution15 {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i=0;i<numbers.length;i++){
            answer = answer - numbers[i];
        }
        return answer;
    }
}