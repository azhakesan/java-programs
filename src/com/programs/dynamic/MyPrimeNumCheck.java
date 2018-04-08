/**
 * 
 */
package com.programs.dynamic;

/**
 *
 */
public class MyPrimeNumCheck {
	public boolean isPrimeNumber(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyPrimeNumCheck p = new MyPrimeNumCheck();
		for(int i=0;i<29;i++) {
			boolean prime=p.isPrimeNumber(i);
			if(prime) {
				System.out.println("Prime "+i);	
			}
			
		}	

	}

}
