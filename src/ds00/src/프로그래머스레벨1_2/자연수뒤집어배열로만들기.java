package 프로그래머스레벨1_반복2;


public class 자연수뒤집어배열로만들기 {
	   
}

class Solution9 {
	public int[] solution(long n) {
        String s = Long.toString(n);
        int[] answer = new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            answer[i] = Integer.parseInt(s.substring(s.length()-1-i,s.length()-i));   
        }
        return answer;
    }
}