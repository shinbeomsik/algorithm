package 프로그래머스풀기레벨0_1회차반복;



public class 문자열바꿔서찾기 {

	public static void main(String[] args) {
		Solution54 sol = new Solution54();
		String myString = ""; 
		String pat = "";

		int answer = sol.solution(myString, pat);
		System.out.println(answer);

	}
}

class Solution54{
	public int solution(String myString, String pat) {
        int answer = 0;
        String[] arr = myString.split("");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("A")){
                arr[i] = "B";
            }else {
                arr[i] = "A";
            }
        }
        
        myString = String.join("",arr);
        if(myString.contains(pat)){
            answer = 1;
        }
        
        return answer;
    }
}