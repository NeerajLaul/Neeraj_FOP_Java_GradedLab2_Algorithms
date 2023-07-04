package com.assignment.currency;

import java.util.Scanner;




public class CurrencyMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size Of Currency Denominations");
		int noOfNotes=sc.nextInt();
		
		int currency[]=new int[noOfNotes];
		
		System.out.println("Enter The Currency Denominations Value");
		for(int i=0;i<currency.length;i++) {
			currency[i]=sc.nextInt();
		}
		MergeSort ms=new MergeSort();
		ms.sort(currency,0,currency.length-1);
		
		System.out.println("Enter Amount To Pay");
		int amount=sc.nextInt();
		
		NoteCounter nc=new NoteCounter();
		nc.counting(currency,amount);
		sc.close();
	}
}
