package testRun;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class archivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Path path = Paths.get(args[0]);
	
		List<String> lineas;
		try {
			lineas = Files.readAllLines(path);
	
		
		for (String string : lineas) {
			System.out.println(string);
		}
		
		
		Stack m = new Stack();
	
				
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
