package leetCode;

public class MergeString {

	/*
	 * You are given two strings word1 and word2. 
	 * Merge the strings by adding letters in alternating order,
	 *  starting with word1. If a string is longer than the other, 
	 *  append the additional letters onto the end of the merged string.

Return the merged string
	 */
	
	public static void main(String[] args) {
		String result=mergeAlternately("abc", "def");
		
		System.out.println(result);
	}
	
	
	public static String mergeAlternately(String word1, String word2) {

	        int m = word1.length();
	        int n = word2.length();
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < Math.max(m, n); i++) {
	            if (i < m) {
	                result.append(word1.charAt(i));
	            }
	            if (i < n) {
	                result.append(word2.charAt(i));
	            }
	        }

	        return result.toString();
	    }
}
