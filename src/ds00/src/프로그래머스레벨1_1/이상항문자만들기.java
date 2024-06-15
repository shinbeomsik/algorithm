package 프로그래머스레벨1_1;


public class 이상항문자만들기 {
	
}

class Solution50 {
	  public String solution(String s) {
	        String answer = "";
	        String[] k = s.split(" ", -1);
	        
	        for(int i=0; i<k.length; i++){
	            String[] q = k[i].split("");
	            for(int j=0; j<q.length; j++){
	                if(j%2==0){
	                    q[j] = q[j].toUpperCase();
	                }else{
	                    q[j] = q[j].toLowerCase();
	                }
	            }
	            k[i] = String.join("",q);
	        }
	        
	        answer = String.join(" " , k);
	        return answer;
	    }
}