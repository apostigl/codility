package org.apostigl.codility.ex4;


/**
 * Solution for Codility exercise.
 * Lesson 2 - Ex 1 (Perm-Check)
 * 
 * @author apostigl
 *
 */


public class Ex4_PermCheck {
	
	public int solution(int[] A){
		
		int N = A.length;
		
		//there is only one element. If its value is 1 the array is a permutation, else not.
		if(N==1){
            return A[0]==1 ? 1 : 0;
		}
		else{
			int count[] = new int[N+1];
					
			for(int i=0 ; i<N ; i++){
				
				//If the value of the array A is larger or equal than the size of the count array, count[] can not be a permutation
				if(A[i] >= count.length){
                    return 0;
                }
				
				//set 1 in count array for every value of A[i].
				count[A[i]] += 1;
				
			}
			
			//starting from 1, because count[0] is never set in the previous iteration
			for(int j=1 ; j<count.length ; j++){
				//If more than one element in A[] have the same value, it cannot be a permutation
				if(count[j]!=1){
					return 0;
				}
				
			}
			
			return 1;
		}
		
	}
	
	
}

