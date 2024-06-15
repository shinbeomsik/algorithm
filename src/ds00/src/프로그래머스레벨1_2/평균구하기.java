package 프로그래머스레벨1_2;


public class 평균구하기 {
	
}

class Solution2 {
	public double solution(int[] arr) {
        double answer = 0;
        for(int i=0;i<arr.length;i++){
            answer = answer + arr[i];
        }
        answer = answer / arr.length;
        return answer;
    }
}