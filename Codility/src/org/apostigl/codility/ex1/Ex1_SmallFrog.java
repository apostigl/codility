package org.apostigl.codility.ex1;

/**
 * 
 * @author apostigl
 *
 */

public class Ex1_SmallFrog {

	public int solution(int X, int Y, int D) {

		int num = Y - X;

		int x = num % D;
		int r = num / D;

		return x == 0 ? r : r + 1;
	}
}

