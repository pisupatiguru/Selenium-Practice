package com.assignment.TestNGAnnotations;

import org.testng.annotations.Test;

public class ClassTwo {
	@Test
	public void testA() {
		System.out.println("Class Two testA execution " + Thread.currentThread().getId());
	}
}
