package org.apostigl.codility.ex2;

public class Ex2_PermMissingElem_Sol2 {
	 public int solution(int[] A) {
	       
	      int N = A.length;
	      
	      //Gauss' formula for 1+2+3+....+N
	      int sum_expected = ((N+2)*(N+1))/2;
	      
	      int sum = 0;
	        
	      if(N==0)
	            return 1;
	      else{
	          for(int i=0;i<N;i++){
	              sum = sum + A[i];
	          }
	          return sum_expected - sum;
	     }
	    }
}
