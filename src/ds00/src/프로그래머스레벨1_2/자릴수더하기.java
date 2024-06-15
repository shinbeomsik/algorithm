package 프로그래머스레벨1_2;


public class 자릴수더하기 {
	   
}

class Solution8 {
	public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for(int i=0;i<s.length();i++){
            answer = answer + Integer.parseInt(s.substring(i,i+1));
        }
        return answer;
    }
}