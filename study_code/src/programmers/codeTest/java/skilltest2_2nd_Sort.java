package programmers.codeTest.java;

import java.util.Arrays;
import java.util.Collections;

/*
 * ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
 */
public class skilltest2_2nd_Sort {
    public static String solution(String s) {
        String[] s_arr = s.split("");
        Arrays.sort(s_arr);
        Collections.reverse(Arrays.asList(s_arr));

        return String.join("",s_arr);
    }
    public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
}
