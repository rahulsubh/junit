package com.cognizant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public int add(int a, int b) {
    	return (a+b);
    }
    
    public int sub(int a, int b) {
    	return (a-b);
    }
    
    public int product(int a, int b) {
    	return (a*b);
    }
    
    public double divide(double a, double b) {
    	if(b == 0.0)
    		return 0.0;
    	return (a/b);
    }
}
