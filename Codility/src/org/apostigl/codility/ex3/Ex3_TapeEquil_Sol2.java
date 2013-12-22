package org.apostigl.codility.ex3;

public class Ex3_TapeEquil_Sol2{
 
	  public int solution(int[] A) {
	        
	        int n = A.length;
	        int sum = 0;
	        int resto;
	        
	        if(n==2){
	            return Math.abs(A[1]-A[0]);
	        }
	        else{
	             int B[] = new int[n];
	        
	            //The sum of values in A[]
	            for(int i=0; i< n;i++){
	                  sum = A[i] + sum; 
	            }
	           
	            
	            int x = 0;
	            //First part and second part of the array, saving the the difference in absolute value
	            for(int p=1; p< n ; p++){
	                x = A[p-1] + x;
	                
	                resto = sum -x;
	                             
	                B[p-1] = Math.abs(x-resto);               
	            }
	            
	            int min = B[0];

	            //The minimum in B[]
	            for(int k=0; k< n-1; k++){               
	                if(B[k] < min)
	                     min = B[k];
	            }
	            
	            return min;
		    }
	    }
}
