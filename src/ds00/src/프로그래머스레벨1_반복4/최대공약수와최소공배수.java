package 프로그래머스레벨1_반복4;


public class 최대공약수와최소공배수 {
	   
}

class Solution30 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        if(n %m ==0){
            answer[0] = m;
            answer[1] = n;
        }else if(m % n ==0){
            answer[0] = n;
            answer[1] = m;
        }else{
            for(int i=1; i<n;i++){
                if(n%i ==0 && m%i ==0){
                    answer[0] = i;
                }
            }
            answer[1] = n * m / answer[0];
        }
        return answer;
    }
}