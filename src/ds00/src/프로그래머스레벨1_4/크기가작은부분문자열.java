package 프로그래머스레벨1_4;


public class 크기가작은부분문자열 {
	   
}

class Solution35 {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0; i<t.length() - p.length()+1; i++){
            String k = t.substring(i,i+p.length());
            
            if(Long.parseLong(p) >= Long.parseLong(k)){
                answer++;
            }
        }
        return answer;
    }
}