package bubblesort;
import java.util.Scanner;
import java.io.*;


public class bubblesort {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = in.nextInt();
		System.out.println("Enter the elements:");
		int []my_array = new int[50];
		for(int i=0;i<size;i++)
		{
			my_array[i] = in.nextInt();
		}
		for(int i=0;i<size-1;i++)
		{
			if(my_array[i]> my_array[i+1])
			{
				int temp=0;;
				temp = my_array[i+1];
				my_array[i+1] = my_array[i];
				my_array[i] = temp;
				
			}
		}
		System.out.println("The array elements are");
		for(int i =0;i<size;i++)
		{
			System.out.println(my_array[i]);
		}
	}

}
