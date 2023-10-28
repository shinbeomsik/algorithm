package 프로그래머스풀기레벨0_1회차반복;



public class 로그인성공 {

	public static void main(String[] args) {
		Solution184 sol = new Solution184();
		String[] id_pw = {};
		String[][] db = {};

		String answer = sol.solution(id_pw, db);
		System.out.println(answer);

	}
}

class Solution184 {
	 public String solution(String[] id_pw, String[][] db) {
	        String answer = "fail";
	        for(int i=0;i<db.length;i++){
	            if(db[i][0].equals(id_pw[0])){
	                if(db[i][1].equals(id_pw[1])){
	                    answer = "login";
	                }else{
	                    answer = "wrong pw";
	                }
	            }
	        }
	        return answer;
	    }
}