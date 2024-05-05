package hackerearth;

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class BubbleSort {
public static void main(String args[] ) throws Exception {
   
 //   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    
  String datasize =   br.readLine();
 String data =  br.readLine();
 String [] splitdata  =  data.split(" ");
  int count=0;
  for (int i=0;i<splitdata.length-1;i++) {
	  for (int j=0;j<splitdata.length-1-i;j++) {
		  
		  if (Integer.parseInt(splitdata[j])>Integer.parseInt(splitdata[j+1])) {
			  String temp = splitdata[j];
			  splitdata[j] = splitdata[j+1];
			  splitdata[j+1] = temp;
			  count = count+1;
		  }
	  }
  }
  System.out.println(count);
}
}
