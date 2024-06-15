package 프로그래머스레벨1_반복2;


public class 크기가작은부분문자열 {
	   
}

class Solution35 {
	public int solution(String t, String p) {
        int answer = 0;
        for(int i=0;i<=t.length()-p.length();i++){
            if(Long.parseLong(t.substring(i,i+p.length())) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}