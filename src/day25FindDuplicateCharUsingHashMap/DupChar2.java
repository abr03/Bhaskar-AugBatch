package day25FindDuplicateCharUsingHashMap;

import java.beans.JavaBean;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


import javax.swing.text.Utilities;

public class DupChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

boolean duplicate=false;
		
		String str="Mukeshh";
		
		char[] charArray=str.toCharArray();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(char c :charArray)
		{
			
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			
			}		
			else {
				System.out.println("Value is not foung"+);
			}

		}
	}
}
