package 프로그래머스레벨1_2;


public class 핸드폰번호가리기 {
	   
}

class Solution19 {
	public String solution(String phone_number) {
        String answer = "";
        String[] s = phone_number.split("");
        for(int i=0;i<s.length-4;i++){
            s[i] = "*";
        }
        answer = String.join("",s);
        
        return answer;
    }
}