package com.assignment.transaction;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args)
	{
		int notr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of Transaction Array");  
		notr=sc.nextInt();										  
		System.out.println("Enter The Values Of Array"); 
		int values[]=new int[notr];
		for(int i=0;i<notr;i++)
		{
			values[i]=sc.nextInt();
		}
		
		System.out.println("Enter Total Number Of Targets To Be Acheived");		
		int targets=sc.nextInt();
		
		
		for(int i=1;i<=targets;i++)
		{
			System.out.println("Please enter target "+ i);		
			int target=sc.nextInt();
			
			int check=0;
			int sum=0;
			
				for(int j=0;j<values.length;j++)
				{
					sum=sum+values[j];
					if(sum>=target)
					{
						check=1;  
						System.out.println("Target Achieved After "+ (j+1)+ " Transactions");
						break;
					}
				}
				
					if(check==0)
						System.out.println("Target Not Achieved");	
			
			
		}
		sc.close();
		

	}

}