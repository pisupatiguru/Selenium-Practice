package com.assignment.TestNGAnnotations;

import org.testng.annotations.Test;

public class ParallelMethodsTest {
	@Test
	public void testA() {
		System.out.println("testA execution " + Thread.currentThread().getId());
	}

	@Test
	public void testB() {
		System.out.println("testB execution " + Thread.currentThread().getId());
	}

	@Test
	public void testC() {
		System.out.println("TestC execution " + Thread.currentThread().getId());
	}

}
