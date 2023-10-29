package 프로그래머스풀기레벨0_1회차반복;



public class 다항식더하기 {

	public static void main(String[] args) {
		Solution186 sol = new Solution186();
		String polynomial = "";

		String answer = sol.solution(polynomial);
		System.out.println(answer);

	}
}

class Solution186 {
	 public String solution(String polynomial) {
	        String answer = "";
	        String[] arr = polynomial.split(" ");
	        
	        int prix= 0;
	        int y = 0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i].contains("x")){
	                String[] brr = arr[i].split("");
	                if(brr.length ==1){
	                    prix = prix + 1;
	                }else {
	                    prix = prix + Integer.parseInt(arr[i].substring(0,arr[i].length()-1));
	                }
	            }else if(arr[i].equals("+")){
	                
	            }else {
	                y = y + Integer.parseInt(arr[i]);
	            }
	        }
	        
	        if(prix >1 &&y==0){
	            answer = prix + "x";
	        }else if(prix >1 && y!=0){
	            answer = prix + "x + " + y;
	        }else if(prix ==0 && y !=0){
	            answer = Integer.toString(y);
	        }else if(prix ==1 && y==0){
	            answer = "x";
	        }else if(prix ==1 && y!=0){
	            answer = "x + " +  Integer.toString(y);
	        }
	        return answer;
	    }
}