package 프로그래머스풀기레벨0;

import java.util.*;
public class 문자열묶기 {

	public static void main(String[] args) {
		Solution117 sol = new Solution117();
		String[] strArr = {"a","bc","d","efg","hi"};

		int answer = sol.solution(strArr);
		System.out.println(answer);

	}
}  

class Solution117 {
	public int solution(String[] strArr) {
        // 문자열 길이를 기준으로 그룹화하기 위한 Map 생성
        Map<Integer, Integer> groupSizeMap = new HashMap<>();

        // 문자열을 길이에 따라 그룹화
        for (String s : strArr) {
            int length = s.length();
            groupSizeMap.put(length, groupSizeMap.getOrDefault(length, 0) + 1);
        }

        // 가장 큰 그룹의 크기 찾기
        int maxGroupSize = 0;
        for (int groupSize : groupSizeMap.values()) {
            maxGroupSize = Math.max(maxGroupSize, groupSize);
        }

        return maxGroupSize;
    }
}