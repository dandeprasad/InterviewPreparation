package hackerearth;

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class SumofSubarrays {
public static void main(String args[] ) throws Exception {
 
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String ArraySizeN = br.readLine();                // Reading input from STDIN

 String arrayinput  = br.readLine(); 
//ArrayList dande = new ArrayList();
Set<	Long> dande = new HashSet<Long>(); 
String mainArray [] = arrayinput.split(" ");
HashMap maintaince= new HashMap();
for ( int i=0;i<mainArray.length;i++) {
	long val = 0;
	long modifedValue = 0;
	String val1="";
	for ( int j=i;j<mainArray.length;j++) {
		val  = val+Long.parseLong(mainArray[j]);
		modifedValue = val;
		if (j>i) {
	val1 = 	val1+"_"+mainArray[j];}
		else {
			val1 = 	val1+mainArray[j];
		}
		maintaince.put(val1, val);
		
		String [] datatocheck = val1.split("_");
		String dar = "";
		for (int z =0;z<datatocheck.length;z++) {
			if (z>0) {
			dar = dar+"_"+datatocheck[z];
			}
			else {
				dar = dar+datatocheck[z];
			}
			if (modifedValue < Long.parseLong(maintaince.get(dar).toString())) {
				modifedValue = Long.parseLong(maintaince.get(dar).toString());
			}
		}
		
		dande.add(modifedValue);
}
}


Iterator itr = dande.iterator();
long output=0;
while(itr.hasNext())
{
	output = output+Long.parseLong(itr.next().toString());
   
}
System.out.println(output);
}}
