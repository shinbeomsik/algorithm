package 프로그래머스풀기레벨1_1회차반복;

import java.util.Calendar;
public class A2016년 {

	public static void main(String[] args) {
		Solution52 sol = new Solution52();
		int a = 1; 
		int b = 1;

		String answer = sol.solution(a, b);
		System.out.println(answer);

	} 
}

class Solution52 {
	public String solution(int a, int b) {
        String answer = "";
         Calendar cal = Calendar.getInstance();
        
        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, a-1 );
        cal.set(Calendar.DAY_OF_MONTH, b);
        
        if(cal.get(Calendar.DAY_OF_WEEK) ==1) {
        	answer = "SUN";
        }else if(cal.get(Calendar.DAY_OF_WEEK) ==2) {
        	answer = "MON";
        }else if(cal.get(Calendar.DAY_OF_WEEK) ==3) {
        	answer = "TUE";
        }else if(cal.get(Calendar.DAY_OF_WEEK) ==4) {
        	answer = "WED";
        }else if(cal.get(Calendar.DAY_OF_WEEK) ==5) {
        	answer = "THU";
        }else if(cal.get(Calendar.DAY_OF_WEEK) ==6) {
        	answer = "FRI";
        }else if(cal.get(Calendar.DAY_OF_WEEK) ==7) {
        	answer = "SAT";
        }
        return answer;
    }
}