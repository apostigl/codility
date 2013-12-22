package org.apostigl.codility.ex2;

public class Ex2_PermMissingElem_Sol1 {
	    public int solution(int[] A) {
	        int n = A.length;
	               
	        int[] B = new int[n+1];
	        int j;
	        
	        int x=0;
	        
	        if(n==0){
	        	//if N==0 the missing element is 1
	        	return 1;
	        }
	        else{
	        	//for every x element of A set an element B[x-1]=1 as a placeholder.
	            for(int i=0;i<n;i++){
	            	
	                    x = A[i];
	                    B[x-1] = 1;
	            }
	            //earches into array B elements B[j]=1. The first element of B different from 1 is the one missing.
	            for(j=0;j<n+1;j++){
	            	
	                if(B[j]!=1)
	                    break;
	            }
	            
	            return j+1;
	        }
	    }
}