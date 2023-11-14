package 프로그래머스풀기레벨1_반복;



public class 문자열내p와y의개수 {

	public static void main(String[] args) {
		Solution7 sol = new Solution7();
		String s = "";

		boolean answer = sol.solution(s);
		System.out.println(answer);

	}
}

class Solution7 {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toUpperCase();
        int pcount = 0;
        int ycount = 0;
        String[] arr = s.split("");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("P")){
                pcount++;
            }else if(arr[i].equals("Y")){
                ycount++;
            }    
        }
        
        if(pcount != ycount){
            answer= false;
        }

        return answer;
    }
}