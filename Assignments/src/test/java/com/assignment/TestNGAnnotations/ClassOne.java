package com.assignment.TestNGAnnotations;

import org.testng.annotations.Test;

public class ClassOne {
	@Test
	public void testA() {
		System.out.println("Class One testA execution " + Thread.currentThread().getId());
	}

	@Test
	public void testB() {
		System.out.println("Class One testB execution " + Thread.currentThread().getId());
	}

	@Test
	public void testC() {
		System.out.println("Class One TestC execution " + Thread.currentThread().getId());
	}
}
