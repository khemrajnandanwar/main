package my.test.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Class to handle different type of exception in single catch block
 * 
 * @author Khemraj Nandanwar
 *
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			// To create ArrayIndexOutOfBoundsException exception
			int a[] = new int[5];
			a[7] = 7;
			// To create NumberFormatException exception
			String s = "310a";
			Integer number = Integer.parseInt(s);
			System.out.println(number);
			// To create FileNotFoundException exception
			File file = new File("c:/data.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException | FileNotFoundException e) {
			System.out.println("Handling all type of exceptions here");
			System.out.println(e.getMessage());
		}
	}

}
