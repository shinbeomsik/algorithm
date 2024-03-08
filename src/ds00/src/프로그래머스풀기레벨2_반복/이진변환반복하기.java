package 프로그래머스풀기레벨2_반복;


public class 이진변환반복하기 {
	   
}

class Solution7 {
	  public int[] solution(String s) {
	        int[] answer = new int[2];
	        while(!s.equals("1")){
	            int ogs = s.length();
	            s = s.replaceAll("0" ,"");
	            int ngs = s.length();
	            answer[1] = answer[1] + (ogs-ngs);
	            s = Integer.toBinaryString(ngs);
	            answer[0]++;
	        }
	        return answer;
	    }
}