package 프로그래머스레벨1_반복2;


public class 비밀지도 {
	   
}

class Solution43 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        for(int i=0;i<arr1.length;i++){
            String k1 = Integer.toBinaryString(arr1[i]);
            String k2 = Integer.toBinaryString(arr2[i]);
            Long q = Long.parseLong(k1) + Long.parseLong(k2);
            String k3 = Long.toString(q);
            while(k3.length() < arr1.length){
                k3 = "0" + k3;
            }
            String[] krr = k3.split("");
            for(int j=0;j<krr.length;j++){
                if(!krr[j].equals("0")){
                    krr[j] = "#";
                }else{
                    krr[j] = " ";
                }
            }
            k3 = String.join("",krr);
            answer[i] = k3;
        }
        return answer;
    }
}