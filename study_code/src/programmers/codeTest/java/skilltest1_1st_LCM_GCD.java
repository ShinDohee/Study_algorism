package programmers.codeTest.java;

import before.Solution;

/*
 * �� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ�ϴ� �Լ�, solution�� �ϼ��� ������. �迭�� �� �տ� �ִ�����, 
 * �״��� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�. 
 * ���� ��� �� �� 3, 12�� �ִ������� 3, �ּҰ������ 12�̹Ƿ� solution(3, 12)�� [3, 12]�� ��ȯ�ؾ� �մϴ�.
 */
public class skilltest1_1st_LCM_GCD {

    public static int[] solution(int n, int m) {
        int[] answer = {0,0};
        int minNum = Math.min(n, m);
        int maxNum = Math.max(n, m);

        
        for (int i = 1; i < minNum+1; i++) {
			if(n%i == 0 && m%i == 0) {
				if(answer[0] < i) {
					answer[0]=i;
				}
			}
		}
        answer[1] = minNum*maxNum/answer[0];
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(3,12)[0]+"___"+solution(3,12)[1]);
	}
}
