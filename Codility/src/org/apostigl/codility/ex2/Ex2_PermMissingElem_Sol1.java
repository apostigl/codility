package org.apostigl.codility.ex2;

public class Ex2_PermMissingElem_Sol1 {
	    public int solution(int[] A) {
	        int n = A.length;
	               
	        int[] B = new int[n+1];
	        int j;
	        
	        int x=0;
	        
	        if(n==0)
	            return 1;
	        else{
	        	//scorro l'array A e per ogni elemento x di A setto un elemento B[x-1]=1 come segnaposto.
	            for(int i=0;i<n;i++){
	                    x = A[i];
	                    B[x-1] = 1;
	            }
	            //scorro l'array B e cerco gli elementi B[j]=1. Se un elemento è diverso da 1 esco perchè è quello mancante.
	            for(j=0;j<n+1;j++){
	                if(B[j]!=1)
	                    break;
	            }
	            
	            return j+1;
	        }
	    }
}
