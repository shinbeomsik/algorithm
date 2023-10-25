package 프로그래머스풀기레벨1;

import java.util.*;

public class 달리기경주 {

	public static void main(String[] args) {
		Solution57 sol = new Solution57();
		String[] players = {"mumu", "soe", "poe", "kai", "mine"}; 
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		String[] answer = sol.solution(players, callings);
		System.out.println(answer);

	} 
}

//HashMap을 사용하여 플레이어 이름과 인덱스를 매핑합니다.
//각 호출을 처리
//현재 호출된 플레이어의 인덱스를 가져옵니다.
//현재 호출된 플레이어의 인덱스를 1 감소시킵니다.
//현재 호출된 플레이어의 인덱스와 그 이전 플레이어의 인덱스를 서로 교환합니다.
//플레이어 배열에서 플레이어들의 순서가 변경됩니다.
//변경된 플레이어 배열을 반환합니다

class Solution57 {
	public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String s : callings) {
            int cur = map.get(s);
            map.put(s, cur - 1);
            map.put(players[cur - 1], cur);
            players[cur] = players[cur - 1];
            players[cur - 1] = s;
        }

        return players;
    }
}