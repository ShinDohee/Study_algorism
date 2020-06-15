package programmers.codeTest.java;

import java.util.HashMap;
import java.util.Map;

public class codeTest_hash3_combination {
	public static int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> hash = new HashMap<>();

		for (String[] strings : clothes) { //�������� �ʰ����� üũ
			hash.put(strings[1], hash.getOrDefault(strings[1], 0) + 1);
		}

		//��� ������ ���Դ� ���� ���� * result
		// result = (A �ʰ����� ����Ǽ� +1)*(B �ʰ����� ����Ǽ� +1)*(C �ʰ����� ����Ǽ� +1) -1
		//-1 �� ��� ���� ���Դ� ��� 
		for (int value : hash.values()) {
			answer *= (value+1) ; 
			
		}

		return answer-1;
	}

	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		System.out.println(solution(clothes));
	}



}
