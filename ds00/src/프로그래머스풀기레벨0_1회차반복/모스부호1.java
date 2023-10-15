package 프로그래머스풀기레벨0_1회차반복;



public class 모스부호1 {

	public static void main(String[] args) {
		Solution142 sol = new Solution142();
		String letter = "";

		String answer = sol.solution(letter);
		System.out.println(answer);

	}
}

class Solution142 {
	 public String solution(String letter) {
	        String answer = "";
	        
	        String[] arr = letter.split(" ");
	        
	        for(int i=0;i<arr.length;i++){
	            if(arr[i].equals(".-")){
	                arr[i] = "a";
	            }else if(arr[i].equals("-...")){
	                arr[i] = "b";
	            }else if(arr[i].equals("-.-.")){
	                arr[i] = "c";
	            }else if(arr[i].equals("-..")){
	                arr[i] = "d";
	            }else if(arr[i].equals(".")){
	                arr[i] = "e";
	            }else if(arr[i].equals("..-.")){
	                arr[i] = "f";
	            }else if(arr[i].equals("--.")){
	                arr[i] = "g";
	            }else if(arr[i].equals("....")){
	                arr[i] = "h";
	            }else if(arr[i].equals("..")){
	                arr[i] = "i";
	            }else if(arr[i].equals(".---")){
	                arr[i] = "j";
	            }else if(arr[i].equals("-.-")){
	                arr[i] = "k";
	            }else if(arr[i].equals(".-..")){
	                arr[i] = "l";
	            }else if(arr[i].equals("--")){
	                arr[i] = "m";
	            }else if(arr[i].equals("-.")){
	                arr[i] = "n";
	            }else if(arr[i].equals("---")){
	                arr[i] = "o";
	            }else if(arr[i].equals(".--.")){
	                arr[i] = "p";
	            }else if(arr[i].equals("--.-")){
	                arr[i] = "q";
	            }else if(arr[i].equals(".-.")){
	                arr[i] = "r";
	            }else if(arr[i].equals("...")){
	                arr[i] = "s";
	            }else if(arr[i].equals("-")){
	                arr[i] = "t";
	            }else if(arr[i].equals("..-")){
	                arr[i] = "u";
	            }else if(arr[i].equals("...-")){
	                arr[i] = "v";
	            }else if(arr[i].equals(".--")){
	                arr[i] = "w";
	            }else if(arr[i].equals("-..-")){
	                arr[i] = "x";
	            }else if(arr[i].equals("-.--")){
	                arr[i] = "y";
	            }else if(arr[i].equals("--..")){
	                arr[i] = "z";
	            } 
	        }
	           
	       answer = String.join("",arr);
	            
	        return answer;
	    }
}