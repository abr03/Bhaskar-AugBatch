package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class SumOfArrays {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateArraySize();
		

	}
	
	
	public static void calculateArraySize() {
			int arraysum=0;
		
			ArrayList<Integer> arr1= new ArrayList<Integer>(1);
			arr1.add(123);
			arr1.add(1222);
			System.out.println(arr1);


		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		arr.add(0,  1);
		arr.add(1,  2);

		arr.add(2,  4);

		arr.add(3,  10);

		arr.add(4,  11);
		
		
		for (int i=0; i<arr.size(); i++) {
			
		int sum=	arr.get(i);
		
		arraysum=sum+arraysum;
		
		}
		
		
		System.out.println(arraysum);
		
	}

}
