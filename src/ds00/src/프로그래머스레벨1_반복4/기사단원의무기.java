package 프로그래머스레벨1_반복4;


public class 기사단원의무기 {
	   
}

class Solution49 {
	public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){
            int yaksu =0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                // i는 약수입니다
                yaksu++;
                // n/i도 약수입니다 (i와 n/i가 같지 않은 경우에만 추가)
                if (j != i / j) {
                    yaksu++;
                }
            }
        }
            if(yaksu > limit){ // limit 보다 크면 power 을 더함
                answer = answer + power;
            }else{             // limit 보다 작으면 yaksu을 더함
                answer = answer + yaksu;
            }
        }
        return answer;
    }
}