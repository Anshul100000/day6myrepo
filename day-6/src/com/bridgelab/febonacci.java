package com.bridgelab;

public class febonacci {
	
	 static int fib(int n)
	    {
	    if (n <= 1)
	       return n;
	    return fib(n-1) + fib(n-2);
	    }
	      
	    public static void main (String args[])
	    {
	    int n = 15;
	    System.out.println(fib(n));
	    }

}
