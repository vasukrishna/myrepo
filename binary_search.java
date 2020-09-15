package program2;

import java.io.*;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		int []my_array = new int[1000];
		int size,lower,upper,mid;
		System.out.println("Enter the array size");
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		lower = 0;
		upper = size-1;
		mid = lower + (lower+upper)/2;
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			my_array[i] = in.nextInt();
		}
		
		System.out.println("Enter the search element");
		int element = in.nextInt();
		for(int i=0;i<size;i++)
		{
			if(my_array[mid]<element)
			{
				lower = mid + 1;
				mid = lower+(lower+upper)/2;
				
			}
			if(my_array[mid]>element)
			{
				upper = mid - 1;
				mid = lower + (lower+upper)/2;
			}
			
		}
		if(my_array[mid]==element)
		{
			System.out.println("We found it");
		}

	}

}
