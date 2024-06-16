package 프로그래머스풀기레벨2_1;


public class 숫자의표현 {
	   
}

class Solution5 {
	/* 둘이 처리 시간은 비슷하다
	 * public int solution(int n) { int answer = 0; for(int i=1;i<=n ;i++){ int sum
	 * =0; for(int j=i; j<=n;j++){ sum = sum + j;
	 * 
	 * if(sum == n){ answer++; break; }else if(sum > n ){ break; } } } return
	 * answer; }
	 */
	
	public int solution(int n) {
        int answer = 0;
        int count = 1;
        while(count != n+1){
            int total =0;
            for(int i=count; i<=n; i++){
                total = total + i;
                
                if(total == n){
                    answer++;
                }else if(total > n){
                    break;
                }
            } 
        
            count++;
        }
        return answer;
    }
}