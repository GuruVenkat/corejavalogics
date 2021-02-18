package core_logics;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // BigInteger object to store result 
	        BigInteger sum; 
	        BigInteger diff; 
	  
	        // Two String obj created for holding the big integer to calculate the sum and subtract
	        String input1 = "9584764536546378989675476576"; 
	        String input2 = "0568734254678754265687945566"; 
	  
	        // Convert the string input to BigInteger 
	        BigInteger a  = new BigInteger(input1); 
	        BigInteger b = new BigInteger(input2); 
	  
	        // Using add() method of BigInteger class 
	        sum = a.add(b); 
	  
	        // result in BigInteger after sum of 2 big Integers
	        System.out.println("The sum of " +a+" and "+b+ " is = "+sum); 
	        
	     // Using subtract() method of BigInteger class
	        diff = a.subtract(b); 
	        
	        // result in BigInteger after sum of 2 big Integers
	        System.out.println("The sum of " +a+" and "+b+ " is = "+diff); 
	    } 
}
