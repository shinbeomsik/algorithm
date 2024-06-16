package 프로그래머스풀기레벨2_1;


public class 피보나치수 {
	   
}

class Solution9 {
	public int solution(int n) {
        int answer = 0;
        long a = 0;
        long b = 1;
        long c = a+b;
        int count =1;
        
        while(count != n){
            c = a + b;
            
            a = b%1234567;
            
            b = c%1234567;
            
            count++;

        }
        answer = (int)c%1234567;
        return answer;
    }
}