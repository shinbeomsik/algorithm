package 프로그래머스레벨1_1;

import java.time.*;
public class a2016년 {
	
}

class Solution52 {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate specificDate = LocalDate.of(2016, a, b);
        
        DayOfWeek dayOfWeek = specificDate.getDayOfWeek();
        
        String dayOfWeekString = dayOfWeek.toString();
        
        answer = dayOfWeekString.substring(0,3);
        return answer;
    }
}