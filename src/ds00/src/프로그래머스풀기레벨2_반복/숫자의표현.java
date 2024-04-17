package 프로그래머스풀기레벨2_반복;


public class 숫자의표현 {
	   
}

class Solution5 {
	public int solution(int n) {
        int answer = 0;
        for(int i=1;i<=n ;i++){
            int sum =0;
            for(int j=i; j<=n;j++){
                sum = sum + j;
                
                if(sum == n){
                    answer++;
                    break;
                }else if(sum > n ){
                    break;
                }
            }
        }
        return answer;
    }
}