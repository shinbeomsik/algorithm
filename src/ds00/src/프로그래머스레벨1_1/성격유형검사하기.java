package 프로그래머스레벨1_1;


public class 성격유형검사하기 {
	
}

class Solution65 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int Rcount =0;
        int Tcount =0;
        int Ccount =0;
        int Fcount =0;
        int Jcount =0;
        int Mcount =0;
        int Acount =0;
        int Ncount =0;
        
        for(int i=0; i<survey.length; i++){
            String[] arr = survey[i].split("");
            if(choices[i] > 4){
                if(arr[1].equals("R")){
                    Rcount = Rcount + (3-(7-choices[i]));
                }else if(arr[1].equals("T")){
                    Tcount = Tcount + (3-(7-choices[i]));
                }else if(arr[1].equals("C")){
                    Ccount = Ccount + (3-(7-choices[i]));
                }else if(arr[1].equals("F")){
                    Fcount = Fcount + (3-(7-choices[i]));
                }else if(arr[1].equals("J")){
                    Jcount = Jcount + (3-(7-choices[i]));
                }else if(arr[1].equals("M")){
                    Mcount = Mcount + (3-(7-choices[i]));
                }else if(arr[1].equals("A")){
                    Acount = Acount + (3-(7-choices[i]));
                }else if(arr[1].equals("N")){
                    Ncount = Ncount + (3-(7-choices[i]));
                }
            }else if(choices[i] < 4){
                if(arr[0].equals("R")){
                    Rcount = Rcount + (4-choices[i]);
                }else if(arr[0].equals("T")){
                    Tcount = Tcount + (4-choices[i]);
                }else if(arr[0].equals("C")){
                    Ccount = Ccount + (4-choices[i]);
                }else if(arr[0].equals("F")){
                    Fcount = Fcount + (4-choices[i]);
                }else if(arr[0].equals("J")){
                    Jcount = Jcount + (4-choices[i]);
                }else if(arr[0].equals("M")){
                    Mcount = Mcount + (4-choices[i]);
                }else if(arr[0].equals("A")){
                    Acount = Acount + (4-choices[i]);
                }else if(arr[0].equals("N")){
                    Ncount = Ncount + (4-choices[i]);
                }
            }
        }
        
        if(Rcount >= Tcount){
            answer = answer + "R";
        }else{
            answer = answer + "T";
        }
        
          if(Ccount >= Fcount){
            answer = answer + "C";
        }else{
            answer = answer + "F";
        }
        
          if(Jcount >= Mcount){
            answer = answer + "J";
        }else{
            answer = answer + "M";
        }
        
          if(Acount >= Ncount){
            answer = answer + "A";
        }else{
            answer = answer + "N";
        }
        
        return answer;
    }
}