package 프로그래머스레벨1_4;


public class 내적 {
	   
}

class Solution22 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0;i<a.length;i++){
            answer = answer + a[i] * b[i];
        }
        return answer;
    }
}