package 프로그래머스레벨1_반복4;


public class 콜라츠추측 {
	   
}

class Solution17 {
    public int solution(long num) {
        int answer = 1;
        
        if( num == 1){
            return 0;
        }
        
        while(answer != 500){
            if(num % 2 ==0){
                num = num/2;
            }else{
                num = num*3 + 1;
            }
            
            if(num == 1){
                break;
            }
            answer++;
        }
        
        if(answer == 500){
            answer = -1;
        }
        return answer;
    }
}