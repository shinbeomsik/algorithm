package 프로그래머스레벨1_2;


public class 두정수사이의합 {
	   
}

class Solution13 {
	public long solution(int a, int b) {
        long answer = 0;
        if(a <=b){
            for(int i=a ;i<=b;i++){
                answer = answer + i;
            }
        }else{
            for(int i=b ;i<=a;i++){
                answer = answer + i;
            }
        }
        return answer;
    }
}