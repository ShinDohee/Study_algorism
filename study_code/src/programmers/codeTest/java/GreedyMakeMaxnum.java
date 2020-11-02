package programmers.codeTest.java;

public class GreedyMakeMaxnum {

	/**
	 * 
	 * 
	 * 문제 설명 어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
	 * 
	 * 예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰
	 * 숫자는 94 입니다.
	 * 
	 * 문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. number에서 k 개의 수를
	 * 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.
	 * 
	 * 제한 조건 number는 1자리 이상, 1,000,000자리 이하인 숫자입니다. k는 1 이상 number의 자릿수 미만인 자연수입니다.
	 * 
	 * 
	 * Stringbuilder가 String 보다 출력이 빠름 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		solution("1924", 2);
		solution("4177252841", 4);
	}

	public static String solution(String number, int k) {
		StringBuilder sb = new StringBuilder();
		int start = 0, maxidx = 0, count = 0;
		char maxnum;

		for (int i = 0; i < number.length() - k; i++) {
			maxnum = number.charAt(start);
			maxidx = start;
			for (int j = start; j <= i + k; j++) {
				if (maxnum < number.charAt(j)) {
					maxnum = number.charAt(j);
					maxidx = j;
				}
			}
			sb.insert(count, maxnum);
			start = maxidx + 1;
			count++;

		}

		return sb.toString();
	}
}
