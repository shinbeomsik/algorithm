package 프로그래머스레벨1_반복2;


public class 하샤드수 {
	   
}

class Solution12 {
	 public boolean solution(int x) {
	        boolean answer = true;
	        String s = Integer.toString(x);
	        int add =0;
	        for(int i=0;i<s.length();i++){
	            add = add + Integer.parseInt(s.substring(i,i+1));
	        }
	        if(x % add !=0){
	            answer = false;
	        }
	        return answer;
	    }
}