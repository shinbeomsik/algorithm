package 프로그래머스레벨1_반복2;


public class 이상한문자만기 {
	   
}

class Solution34 {
	public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ",-1);
        
        for(int i=0;i<arr.length;i++){
            String[] brr = arr[i].split("");
            for(int j=0;j<brr.length;j++){
                if(j%2==0){
                    brr[j] = brr[j].toUpperCase();
                }else{
                    brr[j] = brr[j].toLowerCase();
                }
            }
            arr[i] = String.join("",brr);
        }
        answer = String.join(" ",arr);
        return answer;
    }
}