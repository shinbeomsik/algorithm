package 프로그래머스풀기레벨0;


public class 커피심부름 {

	public static void main(String[] args) {
		Solution124 sol = new Solution124();
		String[] order = {"americanoice", "americano", "iceamericano"};

		int answer = sol.solution(order);
		System.out.println(answer);

	}
}  

class Solution124 {
	public int solution(String[] order) {
        int answer = 0;
        for(int i =0; i<order.length;i++) {
        	if(order[i].equals("iceamericano") ||order[i].equals("americanoice") ) {
        		answer = answer + 4500;
        	}else if(order[i].equals("hotamericano") ||order[i].equals("americanohot") ) {
        		answer = answer + 4500;
        	}else if(order[i].equals("icecafelatte") ||order[i].equals("cafelatteice") ) {
        		answer = answer + 5000;
        	}else if(order[i].equals("hotcafelatte") ||order[i].equals("cafelattehot") ) {
        		answer = answer + 5000;
        	}else if(order[i].equals("americano")) {
        		answer = answer + 4500;
        	}else if(order[i].equals("cafelatte")) {
        		answer = answer + 5000;
        	}else if(order[i].equals("anything")) {
        		answer = answer + 4500;
        	}
        	
        }
        return answer;
    }
}