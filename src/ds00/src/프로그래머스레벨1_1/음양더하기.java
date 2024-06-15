package 프로그래머스레벨1_반복;


public class 음양더하기 {
}

class Solution14 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<signs.length;i++){
            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}