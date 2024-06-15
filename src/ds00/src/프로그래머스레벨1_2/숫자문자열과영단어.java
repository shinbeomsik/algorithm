package 프로그래머스레벨1_2;


public class 숫자문자열과영단어 {
	   
}

class Solution38 {
	public int solution(String s) {
        int answer = 0;
        s = s.replaceAll("zero" , "0")
            .replaceAll("one" , "1")
            .replaceAll("two" , "2")
            .replaceAll("three" , "3")
            .replaceAll("four" , "4")
            .replaceAll("five" , "5")
            .replaceAll("six" , "6")
            .replaceAll("seven" , "7")
            .replaceAll("eight" , "8")
            .replaceAll("nine" , "9");
        
        answer =Integer.parseInt(s);
            
        return answer;
    }
}