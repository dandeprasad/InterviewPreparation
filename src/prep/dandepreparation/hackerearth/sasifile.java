package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sasifile {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("entered the loop");
		} while ((br.readLine()).equalsIgnoreCase("Y"));

		System.out.println("exited the loop");
	}

}