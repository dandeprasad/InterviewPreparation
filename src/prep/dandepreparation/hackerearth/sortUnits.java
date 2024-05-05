package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class sortUnits {
public static void main(String args[] ) throws Exception {
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name = br.readLine();                // Reading input from STDIN
   // Writing output to STDOUT

  /*  //Scanner
    Scanner s = new Scanner(System.in);
    String name = s.nextLine();                 // Reading input from STDIN
    System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
String sizeofA []= name.split(" ");


String data1[] = (br.readLine()).split(" ");  
String data2[] = (br.readLine()).split(" ");  
String data3[] = (br.readLine()).split(" ");  

relationclass dan  = new relationclass(data1);
relationclass dan1  = new relationclass(data2);
relationclass dan2  = new relationclass(data3);
for (int i=0;i<2;i++) {
	
}

}



}

class relationclass{
	
	String left ;
	String right;
	float multiplier;
	relationclass(String[] data){
		left = data[0];
		right = data[3];
		multiplier = Float.parseFloat(data[3]);
	}
}
