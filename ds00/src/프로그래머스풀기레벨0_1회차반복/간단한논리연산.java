package 프로그래머스풀기레벨0_1회차반복;



public class 간단한논리연산 {

	public static void main(String[] args) {
		Solution154 sol = new Solution154();
		boolean x1 = true; 
		boolean x2= true; 
		boolean x3= true; 
		boolean x4= true;

		boolean answer = sol.solution(x1, x2, x3, x4);
		System.out.println(answer);

	}
}

class Solution154 {
	public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean y1 = true;
        boolean y2 = true;
        if(x1 == false && x2==false ){
            y1= false;
        }
        if(x3 ==false && x4==false){
            y2=false;
        }
        
        if(y1==true && y2==true){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}