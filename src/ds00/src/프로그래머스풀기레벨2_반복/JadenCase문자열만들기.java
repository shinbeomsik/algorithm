package 프로그래머스풀기레벨2_반복;


public class JadenCase문자열만들기 {
	   
}

class Solution2 {
	public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ",-1);
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i].toLowerCase();
            String[] brr = arr[i].split("");
            brr[0] = brr[0].toUpperCase();
            arr[i] = String.join("",brr);
        }
        answer = String.join(" " , arr);
        return answer;
    }
}