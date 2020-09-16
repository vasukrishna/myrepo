package program3;
import java.util.Scanner;
import java.io.*;

public class program3 {

	public static void main(String[] args) {
		int size;
		int[] my_array = new int[50];
		System.out.println("Enter the size of array");
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		System.out.println("Enter the array elements");
		for(int i=1;i<=size;i++)
		{
			my_array[i] = in.nextInt();
		}
		System.out.print("Enter the search element");
		int element = in.nextInt();
		for(int i=1;i<=size;i++)
		{
			 if(my_array[i] == element )
			 {
				 System.out.print("Element found at position: "+i);
			 }
		}
		
		
	}

}
