package 프로그래머스풀기레벨1_반복;



public class 가운데글자가져오기 {

}

class Solution20 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        if(s.length()%2 ==0){
            answer = arr[s.length()/2-1] + arr[s.length()/2];
        }else{
            answer = arr[s.length()/2];
        }
        return answer;
    }
}