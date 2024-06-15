package 프로그래머스레벨1_2;
import java.util.regex.*;

public class 신규아이디추천 {
	   
}

class Solution64 {
	public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        
         String regex = "[^a-z0-9-_\\.]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(new_id);
        new_id = matcher.replaceAll("");
        
        new_id = new_id.replaceAll("\\.+","\\.");
        
        if(new_id.charAt(0) == '.'){
            new_id = new_id.substring(1);
        }else if(new_id.charAt(new_id.length()-1) == '.'){
            new_id = new_id.substring(0,new_id.length()-1);
        }
        
        if(new_id.length() ==0){
            new_id = "a";
        }
        
        if(new_id.length() >=16){
            new_id = new_id.substring(0,15);
        }
        
        if(new_id.charAt(new_id.length()-1) == '.'){
            new_id = new_id.substring(0,new_id.length()-1);
        }
        if(new_id.length()<=3){
        while(new_id.length() != 3){
            new_id = new_id + new_id.charAt(new_id.length()-1);
        }
        }
        answer = new_id;
        return answer;
    }
}