package 프로그래머스레벨1_2;


public class 숫자짝꿍 {
	   
}

class Solution58 {
	public String solution(String X, String Y) {
        String answer = "";
        String[] xrr = X.split("");
        String[] yrr = Y.split("");
        int[] xr = new int[10];
        int[] yr = new int[10];
        for(int i=0;i<xrr.length;i++){
            xr[Integer.parseInt(xrr[i])]++;
        }
         for(int i=0;i<yrr.length;i++){
            yr[Integer.parseInt(yrr[i])]++;
        }
        StringBuilder sb = new StringBuilder(); 
        
        for(int i=9; i>=0;i--){
           if(xr[i] > 0 && yr[i]>0){
               if(xr[i] >= yr[i]){
                   for(int j=0;j<yr[i];j++){
                       sb.append(i);
                   }
               }else{
                   for(int j=0;j<xr[i];j++){
                        sb.append(i);
                   }
               }
           }
        }
         answer = sb.toString();
        if(sb.length() == 0){
            answer = "-1";
        }
        if(answer.charAt(0) =='0'){
            answer = "0";
        }
    
        return answer;
    }
}