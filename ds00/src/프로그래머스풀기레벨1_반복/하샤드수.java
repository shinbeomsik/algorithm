package 프로그래머스풀기레벨1_반복;



public class 하샤드수 {

	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		int x = 70;

		boolean answer = sol.solution(x);
		System.out.println(answer);

	}
}

class Solution12 {
    public boolean solution(int x) {
        boolean answer = true;
        String k = Integer.toString(x);
        String[] arr = k.split("");
        int sa = 0;
        for(int i=0;i<arr.length;i++){
            sa = sa + Integer.parseInt(arr[i]);
        }
        
        if(x%sa !=0){
            answer = false;
        }
        return answer;
    }
}