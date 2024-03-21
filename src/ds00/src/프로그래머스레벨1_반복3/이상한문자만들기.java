package 프로그래머스레벨1_반복3;


public class 이상한문자만들기 {
	   
}

class Solution26 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ",-1);
        for(int i=0;i<arr.length;i++){
            String[] brr = arr[i].split("");
            for(int j=0;j<brr.length;j++){
                if(j %2 ==0){
                    brr[j]  = brr[j].toUpperCase();
                }else{
                    brr[j] = brr[j].toLowerCase();
                }
            }
            arr[i] = String.join("",brr);
        }
        answer = String.join(" " , arr);
        return answer;
    }
}