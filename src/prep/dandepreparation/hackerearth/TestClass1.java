package hackerearth;

/* IMPORTANT: Multiple classes and nested static classes are supported */



//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass1 {
public static void main(String args[] ) throws Exception {
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name = br.readLine();                // Reading input from STDIN
   // Writing output to STDOUT

  /*  //Scanner
    Scanner s = new Scanner(System.in);
    String name = s.nextLine();                 // Reading input from STDIN
    System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
int sizeofA = Integer.parseInt(name);
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    String name1 = br.readLine();   
    
    String [] totaldata = name1.split(" ");
   int totalcount =0;
   if (sizeofA==totaldata.length) {
	   
    for (int i= 0;i<totaldata.length;i++) {
    	
   totalcount =  totalcount + Integer.parseInt(totaldata[i]);
    }
    int  somenum = totalcount/sizeofA;
    System.out.println(somenum+1); 
}}
}
