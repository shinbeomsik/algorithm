package 프로그래머스풀기레벨0_1회차반복;



public class 가위바위보 {

	public static void main(String[] args) {
		Solution104 sol = new Solution104();
		String rsp = "";

		String answer = sol.solution(rsp);
		System.out.println(answer);
		
	}
}

class Solution104 {
	public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("0")){
                answer = answer + "5";
            }else if(arr[i].equals("2")){
                answer = answer + "0";
            }else{
                answer = answer + "2";
            }
       
        }
        return answer;
    }
}