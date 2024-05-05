package hackerearth;
/* IMPORTANT: Multiple classes and nested static classes are supported */



//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
public static void main(String args[] ) throws Exception {
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name = br.readLine();                // Reading input from STDIN
   // Writing output to STDOUT

  /*  //Scanner
    Scanner s = new Scanner(System.in);
    String name = s.nextLine();                 // Reading input from STDIN
    System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/

    String [] parts = name.split(" ");
    long number1 = Long.parseLong(parts[0]);
    long number2 = Long.parseLong(parts[1]);
    long leastno = number1;
    if (number1>number2) {
    	leastno = number2;
    }
    
   // int leastno = Integer.parseInt(parts[0]);
//    for (int i = 1;i<parts.length;i++) {
//    	
//    	 int iterNo = Integer.parseInt(parts[i]);
//    	 
//    	if (iterNo<leastno) {
//    		leastno = iterNo;
//    	}
//    	
//    }

//    int count  = 0;
//    for (int j = 1;j<=leastno;j++) {
//        
//  if (number1%j ==0 && number2%j ==0) {
//   		count  = count+1; 
//   	 }
//
//   }   
//    System.out.println(count); 
    
    System.out.println( commDiv(number1, number2));
}

// method to calculate gcd of two numbers 
static long gcd(long a, long b) 
{ 
    if (a == 0)  
        return b; 
      
    return gcd(b%a,a); 
} 
// method to calculate all common divisors 
// of two given numbers 
// a, b --> input integer numbers 
static long commDiv(long a,long b) 
{ 
    // find gcd of a,b 
	long n = gcd(a, b); 
   
    // Count divisors of n. 
    int result = 0; 
    for (int i=1; i<=Math.sqrt(n); i++) 
    { 
        // if 'i' is factor of n 
        if (n%i==0) 
        { 
            // check if divisors are equal 
            if (n/i == i) 
                result += 1; 
            else
                result += 2; 
        } 
    } 
    return result; 
} 
}
