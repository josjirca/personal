package testRun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.BreakIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		 
        System.out.println ("Introduzca un Numero inicial: ");
        String nu = br.readLine ();
        
        System.out.println ("Introduzca un Numero final: ");
        String nu1 = br.readLine ();

        
        int n = Integer.parseInt (nu);
        int m = Integer.parseInt (nu1);
        					
	        for (int i = n ; i <= m ; i++)
	            if ((i % 3 == 0) && (i % 7 == 0)) 
	                System.out.println (i);
	        }      


	 	 
	
}
