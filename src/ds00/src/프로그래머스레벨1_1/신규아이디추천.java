package 프로그래머스레벨1_1;

import java.util.regex.*;

public class 신규아이디추천 {
	
}

class Solution60 {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        
        String regex = "[^a-z0-9-_\\.]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(new_id);
        new_id = matcher.replaceAll("");
        
        new_id = new_id.replaceAll("\\.+" , "\\.");
        
        String[] arr = new_id.split("");
        
        if(arr[0].equals(".")){
            arr[0] = "";
        }
        if(arr[arr.length-1].equals(".")){
            arr[arr.length-1] = "";
        }
        
        new_id = String.join("",arr);
        
        if(new_id.length()==0){
            new_id ="a";
        }
        
        if(new_id.length() >= 16){
            new_id = new_id.substring(0,15);
            arr = new_id.split("");
            if(arr[arr.length-1].equals(".")){
                arr[arr.length-1] = "";
            }
            new_id = String.join("",arr);
        }
        
        if(new_id.length() <=2){
            arr = new_id.split("");
            int count = arr.length;
            while(count !=3){
                new_id = new_id + arr[arr.length-1];
                count++;
            }
        }
        answer = new_id;
        return answer;
    }
}