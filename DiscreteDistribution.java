/******************************************************************************
 *  Compilation:  javac DiscreteDistribution.java
 *  Execution:    java DiscreteDistribution m a1 a2 a3 a4    an
 *  
 *  Takes an integer command-line argument m, followed by a sequence of positive 
 *  integer command-line arguments a1,a2,…,an, and prints m random indices (separated by whitespace), 
 * choosing each index i with probability proportional to ai.
 * 
 *  % java java DiscreteDistribution 25 1 1 1 1 1 1
 *              5 2 4 4 5 5 4 3 4 3 1 5 2 4 2 6 1 3 6 2 3 2 4 1 4

 *
 *  % java java DiscreteDistribution 25 10 10 10 10 10 50
 *              3 6 6 1 6 6 2 4 6 6 3 6 6 6 6 4 5 6 2 2 6 6 2 6 2
 *
 *  % java java DiscreteDistribution 25 80 20
 *              1 2 1 2 1 1 2 1 1 1 1 1 1 1 1 2 2 2 1 1 1 1 1 1 1 
 *
 ******************************************************************************/

public class  DiscreteDistribution{
	public static void main(String[] args){
		int n=args.length;
		int m=Integer.parseInt(args[0]);
		int delta=0;
		int [] distribution=new int [n];
		for (int i=1; i<n; i++){
			distribution[i-1]=Integer.parseInt(args[i]);
			delta+=distribution[i-1];
		}
		int r=0;
		for (int j=0; j<m; j++){
			r= (int)(delta*Math.random());
			int k=0;
			int minValue=0;
			int maxValue=0;
			while(r>=minValue){
				minValue+=distribution[k];
				k++;
				}
		System.out.print(k+" ");
	}
	System.out.println();
	}
	
}