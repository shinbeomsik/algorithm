package 프로그래머스레벨1_반복2;


public class 콜라츠추측 {
	   
}

class Solution15 {
	public int solution(int num) {
        int answer = 0;
        int count =0;
        if(num ==1){
            return 0;
        }
        long w = num;
        while(count<=500){
            if(w%2==0){
                w = w/2;
            }else{
                w = w*3 +1;
            }
            answer++;
            count++;
            if(w==1){
                break;
            }
        }
        if(count == 501){
            answer = -1;
        }
        return answer;
    }
}