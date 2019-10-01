package com.hcl.junitpractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
	
	@Test
	public void testGetPropertyTest(String key) {
		Data objData = new Data();
		assertNotNull(objData.getPropertyTest("Bhargav"));
		assertNull(objData.getPropertyTest("Tushar"));
	}
	@Test
	public void testeven() {
		Data objData = new Data();
		assertTrue(objData.even(10));
		assertFalse(objData.even(11));
	}
	@Test
	public void testminArray() {
		Data objData = new Data();
		int[] a=new int[]{1,2,3,4};
		int[] a1=new int[]{7,2,3,1};
		assertEquals(1, objData.minArray(a1));
	}
	@Test
	public void testMax3() {
		Data objData = new Data();
		assertEquals(5, objData.max3(5, 3, 4));
		assertEquals(5, objData.max3(1, 5, 3));
		assertEquals(5, objData.max3(1, 3, 5));
	}
	@Test
	public void testSum() {
		Data objData = new Data();
		assertEquals(4, objData.sum(2, 2));
		assertEquals(4, objData.sum(1, 3));
	}
	@Test
	public void testSayHello() {
		Data objData = new Data();
		assertEquals("Welcome to Junit", objData.sayHello());
		
	}
}
