package 프로그래머스레벨1_5;


public class 약수의합 {
			  
}

class Solution3 {
	public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n;i++){
            if(n%i == 0){
                answer = answer + i;
            }
        }
        

        int number = 320;
        int sum = 0;
        int sqrt = (int) Math.sqrt(number);
        	for (int i = 1; i <= sqrt; i++) {
        		if (number % i == 0) {
                    sum += i;
                if (i != number / i) { 
                    sum += number / i;
                    }
                }
            }
        return answer;
        

    }
}