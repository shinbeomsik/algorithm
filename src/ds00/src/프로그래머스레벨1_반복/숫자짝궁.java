package 프로그래머스레벨1_반복;


public class 숫자짝궁 {
	
}

class Solution69 {
	public String solution(String X, String Y) {
        String answer = "";
        String[] arrx = X.split("");
        String[] arry = Y.split("");
        
        StringBuilder sb = new StringBuilder(); 
        
        int[] countx = new int[10];
        int[] county = new int[10];
        
        for(int i=0;i<arrx.length;i++){
            countx[Integer.parseInt(arrx[i])]++;
        }
        for(int i=0;i<arry.length;i++){
            county[Integer.parseInt(arry[i])]++;
        }

        for(int i = 9 ; i>=0; i--){
            int cnt = Math.min(countx[i], county[i]);
	            for(int t = 0; t < cnt; t++) {
	                sb.append(i); 
	            }
        }
        answer = sb.toString();
        
        if(sb.length()==0){
             answer = "-1";
        }
        
        if(answer.charAt(0) == '0') {
	        answer = "0";
	    }
        return answer;
    }
}