package mod6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.omg.CORBA.Object;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] palabras = {"juan","nestor","angeline","karla"};
		
		Arrays.sort(palabras);
		
		for (String string : palabras) {
			System.out.println(string);
		}
		
		
		HashSet<String> ohs = new HashSet<String>();

		ohs.add("nuevo");
		ohs.add("temporal");
		ohs.add("temporal 2");
		
		System.out.println(ohs);
	
		
		HashMap ohm = new HashMap();
		
				
		ohm.put(1, "string");
		ohm.put(5, "string");
		ohm.put(8, "string");
		
		System.out.println(ohm);
		
		
		
		
		
		
		System.out.println(String.format(" float %04.6f", 4545456468546.22258596));
		
		
		
}
	
	
}

