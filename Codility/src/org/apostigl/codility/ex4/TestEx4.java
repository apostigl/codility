package org.apostigl.codility.ex4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEx4 {
	Ex4_PermCheck ex = new Ex4_PermCheck();
	
	@Test
	public void test1() {
		
		int A[] = new int [3];
		
		A[0] = 4;
		A[1] = 1;
		A[2] = 3;
		
		assertFalse(ex.solution(A)==1);
	}
	
	@Test
	public void test2(){
		
		int A[] = new int [4];
		
	 	A[0] = 4;
		A[1] = 1;
		A[2] = 3;
		A[3] = 2;
		
		assertTrue(ex.solution(A)==1);
	}
	
	@Test
	public void test3(){
		
		int A[] = new int [4];
		
	 	A[0] = 17;
		A[1] = 1;
		A[2] = 3;
		A[3] = 2;
		
		assertEquals(ex.solution(A),0);
	}

}
