package 프로그래머스레벨1_반복4;


public class 수박수박수박수바굿 {
	   
}

class Solution20 {
    public String solution(int n) {
        String answer = "";
        for(int i=1; i<=n; i++){
            if(i % 2 ==0){
                answer = answer + "박";
            }else{
                answer = answer + "수";
            }
        }
        return answer;
    }
}