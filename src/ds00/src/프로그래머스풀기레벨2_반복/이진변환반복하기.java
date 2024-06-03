package 프로그래머스풀기레벨2_반복;


public class 이진변환반복하기 {
	   
}

class Solution7 {
	  public int[] solution(String s) {
	        int[] answer = new int[2];
	        while(!s.equals("1")){
	            int ogs = s.length();
	            s = s.replaceAll("0" ,"");
	            int ngs = s.length();
	            answer[1] = answer[1] + (ogs-ngs);
	            s = Integer.toBinaryString(ngs);
	            answer[0]++;
	        }
	        return answer;
	    }
	  
		/* 이런 방법도 있다  이게 시간이 더 걸림
		 * public int[] solution(String s) { int[] answer = new int[2];
		 * 
		 * int zero =0; int count =0; int onelenght =0; while(!s.equals("1")){ count++;
		 * String[] arr = s.split("");
		 * 
		 * for(int i=0; i<arr.length; i++){ if(arr[i].equals("0")){ zero++;
		 * 
		 * arr[i] = ""; } } s = String.join("",arr); s =
		 * Integer.toBinaryString(s.length()); } answer[0] = count; answer[1] = zero;
		 * return answer; }
		 */
	  
}