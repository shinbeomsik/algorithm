package 프로그래머스풀기레벨0_1회차반복;



public class 문자열이몇번등장하는지세기 {

	public static void main(String[] args) {
		Solution151 sol = new Solution151();
		String myString = "";
		String pat= " ";

		int answer = sol.solution(myString, pat);
		System.out.println(answer);

	}
}

class Solution151 {
	public int solution(String myString, String pat) {
        int answer = 0;
        String[] arr = myString.split("");
        for(int i=0;i<arr.length -pat.length()+1;i++){
            String k = "";
            for(int j=i; j<i+pat.length();j++){
                k = k + arr[j];
            }
            if(k.equals(pat)){
                answer++;
            }
        }

        return answer;
    }
}