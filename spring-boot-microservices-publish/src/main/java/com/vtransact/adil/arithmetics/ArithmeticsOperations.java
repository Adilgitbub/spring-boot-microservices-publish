package com.vtransact.adil.arithmetics;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticsOperations {

	public static Long add(long a, long b) {
		return a + b;
	}

	public static Long subtract(long a, long b) {
		return a - b;
	}

	public static Long multiply(long a, long b) {
		return a * b;
	}
}
