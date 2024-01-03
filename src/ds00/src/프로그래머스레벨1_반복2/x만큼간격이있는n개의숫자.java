package 프로그래머스레벨1_반복2;


public class x만큼간격이있는n개의숫자 {
	   
}

class Solution7 {
	public long[] solution(int x, int n) {
        long[] answer =new long[n];
        for(int i=0;i<n;i++){
            answer[i] = x + (long)x*i;
        }
        return answer;
    }
}