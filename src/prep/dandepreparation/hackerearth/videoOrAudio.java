package hackerearth;

/* IMPORTANT: Multiple classes and nested static classes are supported */



//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class videoOrAudio {
public static void main(String args[] ) throws Exception {
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String nooflinesData = br.readLine();                // Reading input from STDIN
  
    //String[] nooflinesData = name.split(" ");
    
    ArrayList<String[]> data = new ArrayList();
    for (int i =0;i<Integer.parseInt(nooflinesData);i++) 
    {

    	   String datatoset []= (br.readLine()).split(" ");
       	data.add(datatoset);
    	   
    }
    
    for (int j =0;j<data.size();j++) {
    	
  String processdata[] =  data.get(j);
  for (int k=0;k<processdata.length;k++) {
	  
	
		  if (processdata[0].matches(".*[a-z].*")) { 
			  
			if ( processdata[1].matches(".*\\d+.*")){
				if (processdata.length ==3) {
					if ( processdata[2].matches(".*\\d+.*")){
						if (processdata.length >3) {
							  System.out.println("N");
							  break;
						}
						process_data(processdata[0],processdata[1],processdata[2]);
						  break;
					}
					else {
						  System.out.println("N");	
						  break;
					}
				}
				else {
					process_data(processdata[0],processdata[1]);
					
					  break;
				}
			}
			else {
				  System.out.println("N");
				  break;
			}
			}
		  else {
			  
			  System.out.println("N");
			  break;
		  }
  }
    }
}

public static void process_data(String a, String b){
    /*
        Complete this function to check if the data is a music or not.
    */
	System.out.println("M");
}
public static void process_data(String a, String b, String c){
    /*
        Complete this function to check if the data is a video or not
    */
	System.out.println("V");
}

}

