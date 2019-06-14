/******************************************************************************
 *  Compilation:  javac ThueMorse.java
 *  Execution:    java ThueMorse n
 *  
 *  Prints an n-by-n pattern
 *  
 *     
 *
 *  %java ThueMorse 8
 * +  -  -  +  -  +  +  -
 * -  +  +  -  +  -  -  +
 * -  +  +  -  +  -  -  +
 * +  -  -  +  -  +  +  -
 * -  +  +  -  +  -  -  +
 * +  -  -  +  -  +  +  -
 * +  -  -  +  -  +  +  -
 * -  +  +  -  +  -  -  +
 *
 ******************************************************************************/



public class ThueMorse { 
   public static void main(String[] args) { 
     int N = Integer.parseInt(args[0]);
     int [] seq= new int [N]; 
	 
     for (int i=0; i<N; i++){
     	if (i==0) seq[i]=0;
		 else if (i%2==0) seq[i] = seq[i / 2] ;
		 else seq[i] = 1 - seq[i - 1];
     }
    
    for (int i=0; i<N; i++)
    {
      for(int j=0; j<N; j++){
    	if (seq[i] == seq[j]) System.out.print("+");
      		else System.out.print("-");
    	
    }
     System.out.println();
    }
     
     
	}
}
