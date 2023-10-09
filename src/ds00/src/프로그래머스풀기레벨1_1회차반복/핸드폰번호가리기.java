package 프로그래머스풀기레벨1_1회차반복;



public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		Solution18 sol = new Solution18();
		String phone_number= "";

		String answer = sol.solution(phone_number);
		System.out.println(answer);
	} 
}

class Solution18 {
	public String solution(String phone_number) {
        String answer = "";
        String[] arr = phone_number.split("");
        
        for(int i=0;i<arr.length-4;i++){
            arr[i] = "*";
        }
        
        answer = String.join("",arr);
        return answer;
    }
}