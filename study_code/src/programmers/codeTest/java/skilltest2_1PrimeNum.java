package programmers.codeTest.java;
/*
 * �־��� ���� �� 3���� ���� ������ �� �Ҽ��� �Ǵ� ����� ������ ���Ϸ��� �մϴ�. 
 * ���ڵ��� ����ִ� �迭 nums�� �Ű������� �־��� ��, 
 * nums�� �ִ� ���ڵ� �� ���� �ٸ� 3���� ��� ������ �� �Ҽ��� �Ǵ� ����� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.
 */

public class skilltest2_1PrimeNum {
	   public int solution(int[] nums) {
	        int count =0;
	        
	        for (int i = 0; i < nums.length; i++) {
				for (int j = i+1; j < nums.length; j++) {
					for (int j2 = j+1; j2 < nums.length; j2++) {
						int sum = nums[i]+ nums[j]+nums[j2];
						
						if(isPrime(sum)) count++;
					}
				}
			}
	        
	        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
	        System.out.println("Hello Java");

	        return count;
	    }
	   
	   public static boolean isPrime(int num) {
	        boolean result = true;
	        for(int i = 2; i < num; i++) {
	            if( num%i == 0) {
	                result = false;
	                break; 
	                //������ �������� ���̻� �Ҽ��� �ƴϹǷ� break�� �ɾ� for���� ������.
	            } else {
	                result = true;
	            }
	        }        
	        return result;        
	    }


}
