package 프로그래머스풀기레벨1_;

import java.util.*;
public class 비밀지도 {

	public static void main(String[] args) {
		Solution39 sol = new Solution39();
		int n =1; 
		int[] arr1 = {};
		int[] arr2 = {};

		String[] answer = sol.solution(n, arr1, arr2);
		System.out.println(answer);

	} 
}

class Solution39 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0;i<arr1.length;i++){
            String k = "";
            int p = arr1[i];
            int q = arr2[i];
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            for(int j=0;j<a.length;j++){
                a[n-1-j] = p%2;
                p = p/2;
                b[n-1-j] = q%2;
                q = q/2;
                c[n-1-j] = a[n-1-j]+ b[n-1-j];
            }
            
           for(int j=0;j<c.length;j++){
               if(c[j]>0){
                   k = k + "#";
               }else{
                   k = k + " ";
               }
           }
          
          answer[i] = k;  
        }
        return answer;
    }
}