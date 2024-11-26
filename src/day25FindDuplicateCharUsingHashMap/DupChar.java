package day25FindDuplicateCharUsingHashMap;

import java.beans.JavaBean;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


import javax.swing.text.Utilities;

public class DupChar {

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
			else
			{
				map.put(c, 1);
			}
			
		}
		
		//System.out.println(map);
		
			//Set<Entry<Character, Integer>> allEntries=map.entrySet();
			
			for(java.util.Map.Entry<Character, Integer> en:map.entrySet())
			{
				
				if(en.getValue()>1)
				{
					duplicate=true;
					System.out.println(en.getKey() +" "+en.getValue());
				}
				
			}	
				
			if(!duplicate)
			{
				System.out.println("No Duplicate found");
			}		
				
				
	}
		
}
