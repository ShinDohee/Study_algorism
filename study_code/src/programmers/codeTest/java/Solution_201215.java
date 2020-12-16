package programmers.codeTest.java;

import java.util.ArrayList;

public class Solution_201215 {
	public static ArrayList<String> array = new ArrayList<String>();
	
    public static int solution(int[] stats) {
        int answer = 0;
    	String [] arr = new String[stats.length];
    	StringBuilder sb = new StringBuilder();
    	int indx =0;
    	
  	for (int i = 0; i < stats.length; i++) {
    		
    		if(i==0) array.add(String.valueOf(stats[i]));
    		else {
//    			System.out.println(i);
    			addArray(stats[i]);
    			
    		}
			
		}
 
    	
    	return array.size();
    }
  /**
   * ����Ʈ�� String�� ���ڵ��� �� ���и�� ��� ������ true;
   * ū���� �Ѱ���  ���� �� false
   * @param a  ���� string
   * @param i  �� ���� 
   * @return
   */
    public static boolean CompareToNum (String a, int i) {
    	boolean checkCompare = true;
    	String [] sdf = a.split("");
    	
    	for (String string : sdf) {
    		if(Integer.parseInt(string)> i)
    			return false;
		} 
    	
    	return checkCompare;
    }
    
    /**
     * 
     * @param i
     * @return
     */
    public static void addArray (int i) {
    	 String str = String.valueOf(i);
    	for(int j=0;j<array.size(); j++) {
			if(CompareToNum(array.get(j), i)) {
				
				array.set(j, array.get(j) +str);
				return;
			}else {
				continue;
			}
		}
    	array.add(str);
    	
    }
    
    public static void main(String[] args) {
    	int [] sts = {5, 3, 4,6,1};
    	int result = solution(sts);
		System.out.println(result);
	}
}
