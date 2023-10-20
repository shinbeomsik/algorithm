package 프로그래머스풀기레벨0_1회차반복;



public class 커피심부름 {

	public static void main(String[] args) {
		Solution164 sol = new Solution164();
		String[] order = {};

		int answer = sol.solution(order);
		System.out.println(answer);

	}
}

class Solution164 {
	  public int solution(String[] order) {
	        int answer = 0;
	        
	        for(int i=0;i<order.length;i++){
	            if(order[i].equals("iceamericano") || order[i].equals("americanoice") ||order[i].equals("anything") || order[i].equals("americano") ){
	                answer = answer + 4500;
	            }else if(order[i].equals("hotamericano") ||order[i].equals("americanohot")){
	                answer = answer + 4500;
	            }else if(order[i].equals("icecafelatte") ||order[i].equals("cafelatteice")||order[i].equals("cafelatte") ){
	                answer = answer + 5000;
	            }else if(order[i].equals("hotcafelatte") ||order[i].equals("cafelattehot")){
	                   answer = answer + 5000;
	            }
	            
	            
	        }
	        return answer;
	    }
}