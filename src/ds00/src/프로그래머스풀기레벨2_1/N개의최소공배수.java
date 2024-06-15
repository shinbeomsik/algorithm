package 프로그래머스풀기레벨2_반복;

import java.util.*;
public class N개의최소공배수 {
	   
}
//유클리드 호제법을 생각하기
class Solution14 {
	public int solution(int[] arr) {
        Arrays.sort(arr);
        // 최소 공배수 구하는 
        for (int i=0; i<arr.length-1; i++) {
            int num = getGCD(arr[i+1], arr[i]);
            arr[i+1] = (arr[i] * arr[i+1]) / num;
            
        }
        return arr[arr.length-1];
    }
    
    // 최대 공약수 구하기 (유클리드 호제법!)
    public static int getGCD(int n1, int n2) {
        if  (n1 % n2 == 0) {
            return n2;
        }
        return getGCD(n2, n1%n2);
    }
}