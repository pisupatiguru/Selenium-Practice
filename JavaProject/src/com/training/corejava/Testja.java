package com.training.corejava;

public class Testja {

	int a = 10;
	short b = 5;
	
	String str = "guru";
	int[] arr = {};
	long accountno = 1235456;
	
	public long displayaccount (long accno)
	{
		accountno=accno;
		return accountno;
	}
	
    public static void main(String[] args)
    {
    	Testja objtestja = new Testja();
    	long lastestval = objtestja.displayaccount(897456);
    	System.out.println("updated account= "+ lastestval);
    }
	
}
