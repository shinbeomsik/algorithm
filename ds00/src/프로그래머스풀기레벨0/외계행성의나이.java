package 프로그래머스풀기레벨0;


public class 외계행성의나이 {

	public static void main(String[] args) {
		Solution77 sol = new Solution77();
		int age = 23;

		String answer = sol.solution(age);
		System.out.println(answer);

	}
}  

class Solution77 {
	/*
	 * public String solution(int age) { String answer = ""; String k = age + "";
	 * String[] arr = k.split(""); for(int i=0;i<arr.length;i++) {
	 * if(arr[i].equals("0")) { arr[i] = "a"; }else if(arr[i].equals("1")) { arr[i]
	 * = "b"; }else if(arr[i].equals("2")) { arr[i] = "c"; }else
	 * if(arr[i].equals("3")) { arr[i] = "d"; }else if(arr[i].equals("4")) { arr[i]
	 * = "e"; }else if(arr[i].equals("5")) { arr[i] = "f"; }else
	 * if(arr[i].equals("6")) { arr[i] = "g"; }else if(arr[i].equals("7")) { arr[i]
	 * = "h"; }else if(arr[i].equals("8")) { arr[i] = "i"; }else
	 * if(arr[i].equals("9")) { arr[i] = "j"; }
	 * 
	 * } answer = String.join("",arr); return answer; }
	 */
	
	//이 밑에있는것보다 위에있는게 조금더 빠르다 .. 
    public String solution(int age) {
        String answer = "";
        String[] arr = (age+"").split("");
        for(int i=0;i<arr.length;i++) {
        	if(arr[i].equals("0")) {
        		arr[i] = "a";
        	}else if(arr[i].equals("1")) {
        		arr[i] = "b";
        	}else if(arr[i].equals("2")) {
        		arr[i] = "c";
        	}else if(arr[i].equals("3")) {
        		arr[i] = "d";
        	}else if(arr[i].equals("4")) {
        		arr[i] = "e";
        	}else if(arr[i].equals("5")) {
        		arr[i] = "f";
        	}else if(arr[i].equals("6")) {
        		arr[i] = "g";
        	}else if(arr[i].equals("7")) {
        		arr[i] = "h";
        	}else if(arr[i].equals("8")) {
        		arr[i] = "i";
        	}else if(arr[i].equals("9")) {
        		arr[i] = "j";
        	}
        	
        }
        answer = String.join("",arr);
        return answer;
    }
}