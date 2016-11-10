package Fold;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File {
	public static void main(String[] args) throws java.io.IOException
	{
		String File = args[0];
		
		if(File.equals("-help")){
			System.out.println("This is help message.");
		}
		else if(File.equals("")){
			System.out.println("Please Input file name.");
		}
		
		else{
			BufferedReader read=new BufferedReader(new FileReader(File));
		}

		String style=args[1];
		
		if(style.equals("plain")){
			System.out.print("This is Plain Style");
			// plain class
		}
		else if(style.equals("fancy")){
			System.out.print("This is Fancy Style");
			// fancy class
		}
		else if(style.equals("slide")){
			System.out.print("This is Slide Style");
			// slide class
		}
		else{
			System.out.print("Please, Input right type.");}
		
	}
	

}

