package com.rvr.interest;

public class CompoundInterest {
	public static double calculate(int p, int t, int r, int n) {
		
		return p * Math.pow(((float) (r / 100.0) / n) + 1, n * t);
		
	}
}
