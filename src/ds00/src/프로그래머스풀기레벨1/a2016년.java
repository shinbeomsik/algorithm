
package 프로그래머스풀기레벨1;

import java.util.Calendar;

public class a2016년 {

	public static void main(String[] args) {
		Solution42 sol = new Solution42();
		int a = 5; 
		int b = 24;

		String answer = sol.solution(a, b);
		System.out.println(answer);

	} 
}

//달력문제는 Calendar 을 사용하자   ==>> import java.util.Calendar;
//cal.set(Calendar.YEAR, 2016); 년도를 지정
//cal.set(Calendar.MONTH, a -1); 월을 지정 (1월은 자바에서 0이기에 -1 == 불러올때는 8월을 부르고 싶으면 +1하기)
//cal.set(Calendar.DAY_OF_MONTH, b); 날짜를 지정
//cal.get(Calendar.DAY_OF_WEEK) 일~월요일까지 요일을 구해점 일요일 ==1 ,월요일 ==7 임

class Solution42 {
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
        
        System.out.println(cal.get(Calendar.MONTH));
        return answer;
    }
}