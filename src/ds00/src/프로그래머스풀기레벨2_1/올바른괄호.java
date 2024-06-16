package 프로그래머스풀기레벨2_1;


public class 올바른괄호 {
	   
}

class Solution4 {
	 boolean solution(String s) {
	        boolean answer = true;
	        
	        int count =0;

	        for(int i=0;i<s.length(); i++){
	            if(s.charAt(i) == '('){
	                count++;
	            }else{
	                count--;
	            }
	            if(count < 0){
	                return false;
	            }
	        }
	        
	        if(count != 0){
	            answer = false;
	        }
	        return answer;
	    }
}

/* 이코드는 호율성 테스트 2번만 통과가 안됨 어찌해야될지 모르겠음
 * class Solution { boolean solution(String s) { boolean answer = true;
 * 
 * ArrayList<Character> kr = new ArrayList<>();
 * 
 * for(int i=0;i<s.length();i++){ kr.add(s.charAt(i)); if(s.charAt(0) == ')'){
 * return false; }else if(s.charAt(s.length()-1) == '('){ return false; }
 * if(kr.size()>=2){ if(kr.get(kr.size()-2)== '('){ if(kr.get(kr.size()-1) ==
 * ')'){ kr.remove(kr.size()-2); kr.remove(kr.size()-1); } }
 * if(s.charAt(kr.size()) == ')'){ return false; } } } if(kr.size() !=0){ answer
 * = false; } return answer; } }
 */