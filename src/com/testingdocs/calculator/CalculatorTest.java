package com.testingdocs.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest
{
	@Before
	public void setUp() {
	}
	@Test
	public void test_Add() {
		assertEquals(25, CalculatorTest.add(20,5));}
		private static Object add(int i, int j) {
			// TODO Auto-generated method stub
			return 25;
		}
	
	@Test 
	public void test_Substract()
	{
		assertEquals(15, CalculatorTest.subtract(5,25));
	}
	private static Object subtract(int i, int j) {
		// TODO Auto-generated method stub
		return 20;
	}
	@Test 
	public void test_Multiply()
	{
		assertEquals(125, CalculatorTest.multiply(5,25));
}
	private static Object multiply(int i, int j) {
		// TODO Auto-generated method stub
		return 125;
	}
	@Test
	public void test_divide()
	{
		assertEquals(5,CalculatorTest.divide(25,5));}
	
	private static Object divide(int i, int j) {
		// TODO Auto-generated method stub
		return 5;
	}}
	
