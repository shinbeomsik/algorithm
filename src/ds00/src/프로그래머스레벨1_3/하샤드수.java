package 프로그래머스레벨1_3;


public class 하샤드수 {
	   
}

class Solution10 {
	public boolean solution(int x) {
        boolean answer = true;
        
        String k = Integer.toString(x);
        String[] krr = k.split("");
        
        int a = 0;
        
        for(int i=0;i<krr.length;i++){
            a = a + Integer.parseInt(krr[i]);
        }
        if(x%a !=0){
            answer = false;
        }
        return answer;
    }
}