package 프로그래머스레벨1_3;


public class 없는숫자더하기 {
	   
}

class Solution13 {
	 public int solution(int[] numbers) {
	        int answer = 45;
	        for(int i=0; i<numbers.length; i++){
	            answer = answer - numbers[i];
	        }
	        return answer;
	    }
}