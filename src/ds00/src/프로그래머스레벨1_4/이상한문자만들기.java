package 프로그래머스레벨1_4;


public class 이상한문자만들기 {
	   
}

class Solution33 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ",-1);
        for(int i=0; i<arr.length; i++){
            String[] krr = arr[i].split("");
            for(int j=0; j<krr.length; j++){
                if(j % 2 ==0){
                    krr[j] = krr[j].toUpperCase();
                }else{
                    krr[j] = krr[j].toLowerCase();
                }
            }
            arr[i] = String.join("" , krr);
        }
        answer = String.join(" " , arr);
        return answer;
    }
}