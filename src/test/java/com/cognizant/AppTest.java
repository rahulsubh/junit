package com.cognizant;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    
    @Test
    public void test() {
    	App app=new App();
    	int a=app.add(2, 2);
    	int e=4;
    	assertEquals(a, e);
    	
    }
    
    @Test
    public void test1() {
    	App app = new App();
    	int b = app.sub(1, 1);
    	int d = 0;
    	assertEquals(b, d);
    }
    
    @Test
    public void test2() {
    	App app = new App();
    	int b = app.product(1, 0);
    	int d = 0;
    	assertEquals(b, d);
    }
    
    @Test
    public void test3() {
    	App app = new App();
    	double b = app.divide(4, 2);
    	double d = 2.0;
    	assertEquals(b, d);
    }
    
    
}
