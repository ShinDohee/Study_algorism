package programmers.codeTest.java;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class codeTest_HIndex {
    public static int solution(int[] citations) {
        int answer = 0; // ����� 
        	//list �� ��ȭ
        Arrays.sort(citations); //�ο��� �� �迭 ���� ���� 

        for (int i = 0; i < citations.length; i++) {
			int smallNum = Math.min(citations[i], citations.length-i);
			answer = Math.max(answer, smallNum);
		}			

        return answer;
    }

    public static void main(String[] args) {
    	int[] citations = {3, 0, 6, 1, 5};
    	solution(citations);
    	
	}
}
