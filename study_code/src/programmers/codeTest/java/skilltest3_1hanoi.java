package programmers.codeTest.java;

import java.util.Arrays;

public class skilltest3_1hanoi {
	public static int[][] answer = {};
	public static int x =0;
	
    /*
     * n���� other����� ����� from -> to�� �ű��
     * @param n �ű�� ����
     * @param from �����
     * @param other ������
     * @param to ������
     */
    public static void hanoi(int n, int from, int other, int to){
        if(n == 0)
            return;
        hanoi(n-1, from, to, other);  // n-1���� ������ �������� �ƴ� ��(other)�� �Űܳ���.
        answer[x][0] = from;          // ������ ������ �������� �ű�.
        answer[x++][1] = to;          // ������ ������ �������� �ű�.
        hanoi(n-1, other, from, to);  // �������� �ƴ� ��(other)�� �Űܳ��Ҵ� ���ǵ��� �������� �ű�
    }
      
    public int[][] solution(int n) {
        int num = (int)Math.pow(2, n) - 1;    // �ϳ����� �̵� Ƚ��: 2^n - 1
        answer = new int[num][2]; // Ƚ���� num��ŭ, ���� 3��(�� ���� ���)
        hanoi(n, 1, 2, 3);
        return answer;
    }
    
    

}
	