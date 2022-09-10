package servlet;

import java.util.Scanner;

public class Encrypt 
{
	public static void main(String args[])
	{
		char[] alpha="abcdefghijklmnopqrstuvwsyz".toCharArray();
		Scanner sc= new Scanner(System.in);
		String value=sc.next();
		char[] val=value.toCharArray();
		for(int i=0;i<=val.length;i++)
		{
			char c=val[i];
			int index = alpha.indexOf(arr, target);
			  
	        if (index != -1) {
	            System.out.println("Target is present at index "
	                               + index);
	        }
	        else {
	            System.out.println("Target is not present"
	                               + " in the array");
	        }
		}
		
	}
}
