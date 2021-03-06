package org.apostigl.codility.ex1;

/**
 * Solution for Codility exercise.
 * Lesson 1 - Ex 1 (Frog Jump)
 * 
 * @author apostigl
 *
 */

public class Ex1_FrogJmp {

	public int solution(int X, int Y, int D) {

		int num = Y - X;

		int x = num % D;
		int r = num / D;

		return x == 0 ? r : r + 1;
	}
}

