package 프로그래머스레벨1_1;


public class 약수의합 {
}

class Solution6 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer = answer + i;
            }
        }
        return answer;
    }
}