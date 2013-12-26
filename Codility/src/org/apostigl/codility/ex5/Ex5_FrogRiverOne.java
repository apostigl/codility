package org.apostigl.codility.ex5;

public class Ex5_FrogRiverOne {
	 public int solution(int X, int[] A) {
	       
		int N = A.length;
		int count[] = new int[X + 1];

		int counter = 0;
		int earliestTime = 0;

		// otherwise it will be never set
		count[0] = 1;

		// only one leaf fell - if the target position is 1 the frog can
		// complete the path in only one jump (earliest time = zero).
		// otherwise it will never do it.
		if (N == 1) {
			return X > 1 ? -1 : 0;
		}

		// for every position of the leaves, set count[A[i]]=1
		// A[i] is the position of the leaf, count[A[i]] a placeholder used
		// to save the information about if the leaf has fallen on frog path
		for (int i = 0; i < N; i++) {

			int leafPosition = A[i];

			// each element of array A must be an integer within the range [1..X]
			if (leafPosition > X) {
				return -1;
			}
			else {
				//if the information about the new leaf position has not already set
				if (count[leafPosition] != 1) {
					// save the information about the "useful" position of the leaf that has fallen on frog path
					// "useful" in order to complete the path (leaf not already present on the path)
					count[leafPosition] = 1;

					// update the number of leaves not already present in this position
					counter++;
				}
			}
			
			//the frog now has all the leaves it needs to jump along the path
			if (counter == X)
				return earliestTime;

			earliestTime++;

		}

		return -1;
	}
}
