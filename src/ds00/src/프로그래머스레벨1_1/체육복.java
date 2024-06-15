package 프로그래머스레벨1_1;


public class 체육복 {
	
}

class Solution70 {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] krr = new int[n+1];
        for(int i=0;i<lost.length; i++){
            krr[lost[i]]--;
        }
        for(int i=0;i<reserve.length; i++){
            krr[reserve[i]]++;
        }
        for(int i=1;i<krr.length;i++){
            if(krr[i-1] + krr[i] == 0){
                krr[i-1] = 0;
                krr[i] =0;
            }
        }

        for(int i=1;i<krr.length;i++){
            if(krr[i]>=0){
                answer++;
            }
        }
        return answer;
    }
}