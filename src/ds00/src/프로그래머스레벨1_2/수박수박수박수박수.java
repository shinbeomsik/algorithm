package 프로그래머스레벨1_2;


public class 수박수박수박수박수 {
	   
}

class Solution23 {
	public String solution(int n) {
        String answer = "";
        for(int i=0;i<n;i++){
            if(i%2==0){
                answer = answer + "수";
            }else{
                answer = answer + "박";
            }
        }
        return answer;
    }
}