package testRun;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] aMatriz = new int[12];
		int[] aMatriz2 = new int[12];
		 
	     for (int i = 0 ; i < 12 ; i++)
	     {	    
	    	 aMatriz[i] = i;
	    	 System.out.println(aMatriz[i]);
	     }

	     System.out.println("===========================");
	     
	     aMatriz2 = aMatriz.clone();
	     
	     for (int i : aMatriz2) {
	    	 System.out.println(i);
		}
	     
	     int [][] m1 = {
	    		 {1,2,3},
	    		 {4,5,6},
	    		 {7,8,9}
	     };

	     	     
	}
	

}
