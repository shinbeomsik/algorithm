package 프로그래머스레벨1_반복3;


public class 크기가작은부문문자열 {
	   
}

class Solution38 {
	  public int solution(String t, String p) {
	        int answer = 0;
	        for(int i=0;i<t.length() - p.length() + 1;i++){
	            String k = t.substring(i,i+p.length());
	            if(Long.parseLong(k) <= Long.parseLong(p)){
	                answer++;
	            }
	        }
	        return answer;
	    }
}