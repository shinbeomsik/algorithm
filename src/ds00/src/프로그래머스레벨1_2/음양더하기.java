package 프로그래머스레벨1_2;


public class 음양더하기 {
	   
}

class Solution14 {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<signs.length;i++){
            if(signs[i]){
                answer = answer + absolutes[i];
            }else {
                answer = answer - absolutes[i];
            }
        }
        return answer;
    }
}