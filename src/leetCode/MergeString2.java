package leetCode;

public class MergeString2 {

	
	
	public static void main(String[] args) {
		String result=mergeAlternately("abc", "def");
		
		System.out.println(result);
	}
	
	
	public static String mergeAlternately(String word1, String word2) {

	        
	       String merged= word1+ word2;

	        return merged;
	    }
}
