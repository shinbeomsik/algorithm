package 프로그래머스레벨1_4;


public class 평균구하기 {
	   
}

class Solution8 {
	public double solution(int[] arr) {
        double answer = 0;
        for(int i=0; i<arr.length; i++){
            answer= answer + arr[i];
        }
        answer = answer/arr.length;
        return answer;
    }
}