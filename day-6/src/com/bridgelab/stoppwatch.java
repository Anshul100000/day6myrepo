package com.bridgelab;

public class stoppwatch {
	
	public static void main(String[] args) {

        Stopwatch stopWatch = new Stopwatch();

        stopWatch.start();
        Fibonacci(40);
        stopWatch.stop();

        System.out.println("Get elapsed time in milliseconds: " + stopWatch.getTime(TimeUnit.MILLISECONDS));
        System.out.println("Get elapsed time in seconds: " + stopWatch.getTime(TimeUnit.SECONDS));
        System.out.println("Get elapsed time in minutes: " + stopWatch.getTime(TimeUnit.MINUTES));
        System.out.println("Get elapsed time in hours: " + stopWatch.getTime(TimeUnit.HOURS));

    }

    private static BigInteger Fibonacci(int n) {
        if (n < 2)
            return BigInteger.ONE;
        else
            return Fibonacci(n - 1).add(Fibonacci(n - 2));
    }

}
