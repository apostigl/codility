package org.apostigl.codility.ex3;

import java.math.*;

/**
 * First solution for Codility exercise. It takes O(n^2)
 * Lesson 1 - Ex 3 (Tape-equilibrium)
 * 
 * @author apostigl
 *
 */

public class Ex3_TapeEquil_Sol1 {
	    public int solution(int[] A) {
	        int n = A.length;

	        int sum1 = 0;
	        int sum2 = 0;
	        int B[] = new int[n-1];
	        
	        int min = 0;
	        
	        if(n==2){
	            return Math.abs(A[1]-A[0]);
	        }
	        else{
	                for(int p = 1 ; p <= n-1 ; p++){
	                                   
	                    int x = 0;
	                    int y = 0;
	                    
	                    //the sum of the first part of the array (from 0 to p)
	                    for(int i=0; i<p ; i++){
	                        
	                           x = A[i] + x;
	 
	                    }
	                    
	                    sum1 = x;
	                                    
	                    //the sum of the second part of the array (from p to n-1)
	                    for(int j=p; j<n ; j++){
	                    
	                        y = A[j] + y;
	                    }
	                    
	                    sum2 = y;
	                                        
	                    //save the difference in absolute value into a second array
	                    B[p-1] = Math.abs(sum1-sum2);
	                   }
	            
	            
	                min = B[0];
	           
	            
	                //search for the minimum in the second array
	                for(int k=1 ; k<n-1; k++){
	                
	                    if(B[k] < min)
	                        min = B[k];
	                }
	               
	                return min;
	            }
	    }
}
