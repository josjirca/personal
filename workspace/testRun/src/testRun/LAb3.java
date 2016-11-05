package testRun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class LAb3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		   int [][] mBidi = new int [4][4];
		   
		   Random m = new Random();
		   
		   for (int i = 0; i < 4; i++)
		   {
			   for (int y = 0; y < 4; y++)
			   {				   
				   mBidi[i][y] = m.nextInt();
				   
				   System.out.println(mBidi[i][y]);
			
				   if (mBidi[i][y] / 2 != 0)
				   {
					   mBidi[i][y] = mBidi[i][y] * 2;
				   }		   
										
				   System.out.println("Posicion x:" + String.valueOf(i) + " Posicion y:" + String.valueOf(y) + " Valor:" + String.valueOf(mBidi[i][y]));
				   
			   }
		   }
		   
		   BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		   
		    System.out.println ("Introduzca un Numero de 0 a 4 para Drill: ");
	        String nu = br.readLine();

	        
	        int n = Integer.parseInt (nu);
		    int iSum = 0;
		  
			   for (int i = 0; i < 4; i++)
			   {				   
				   iSum = mBidi[i][n];
						   
			   }
			   
			   System.out.println(iSum);
			   
			   		  		   		
	} // main
} // class
