package deepValue;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/* 
 * Example output
B1,25,0
B2,0,13
B3,1,0

Kindly let me know how 13 and 25 is used for balancing .

I understood that each pan has 1 kg weight. kindly if possible accept this output
So for balancing i tried to add incrementely to make the weighing balances equal.
*/


//weighting scale class 
class 	weighingScale {
	
	String WeighPanID=null ;
	weighingScale leftPan=null;
	weighingScale rightPan=null;
	int leftPanValue=0;
	//right side weight is initialized to 1 as mentioned in question everytime right side pan as 1 kg weight
	int rightPanValue=0;
	weighingScale(String id , weighingScale ltpan,weighingScale rtpan,int lfpanval,int rtpanval){
		WeighPanID = id;
		leftPan = ltpan;
		rightPan = rtpan;
		leftPanValue = lfpanval;
		rightPanValue =rtpanval;
		
	}

}

//weights class
class Weights{
	
	 weighingScale Insert(String wtid, weighingScale leftobj, weighingScale rightobj, int leftvalue, int rightvalue, HashMap<String, weighingScale> hooks) {
	

	 weighingScale 	wtscle= 	new weighingScale(wtid,leftobj,rightobj,leftvalue,rightvalue);
		hooks.put(wtid,wtscle);
	return wtscle;
	
	
}

		public  void callbalanceWeights(weighingScale fial) {
			try {
			 balanceWeights( fial) ;

			}
			catch(Exception ex) {
				System.out.println(ex);
				ex.printStackTrace();
			}
		}
		//main logic for balancing the weights 
		
	public int balanceWeights(weighingScale fial) {
		
	if(fial.leftPan==null && fial.rightPan==null) {
		int x = 0 , y=0 ;
		if(fial.leftPanValue<fial.rightPanValue) {
			x= (fial.rightPanValue-fial.leftPanValue);
			fial.leftPanValue = fial.leftPanValue+ (fial.rightPanValue-fial.leftPanValue);
			
			}
		if(fial.rightPanValue<fial.leftPanValue) {
			y = (fial.leftPanValue-fial.rightPanValue);
			
			fial.rightPanValue = fial.rightPanValue+ (fial.leftPanValue-fial.rightPanValue);
			
			}
		System.out.println(fial.WeighPanID +" "+ x +" "+y);
		
		return fial.leftPanValue + fial.rightPanValue ;
		
	}
	
	if(fial.leftPan!=null) {
		int x=0,y=0;
	fial.leftPanValue = balanceWeights( fial.leftPan) +1;
//	System.out.println("Left value"+fial.leftPanValue);
//	System.out.println("Left value"+(fial.rightPanValue-fial.leftPanValue));
	
	if(fial.leftPanValue<fial.rightPanValue) {
		x= (fial.rightPanValue-fial.leftPanValue);
		fial.leftPanValue = fial.leftPanValue+ (fial.rightPanValue-fial.leftPanValue);
		
	
		}
	if(fial.rightPanValue<fial.leftPanValue) {
		y = (fial.leftPanValue-fial.rightPanValue);
		
		fial.rightPanValue = fial.rightPanValue+ (fial.leftPanValue-fial.rightPanValue);
		
		}	
	System.out.println(fial.WeighPanID +" "+ x +" "+y);
	}
//	fial.leftPanValue= 
	if(fial.rightPan!=null) {
		int x=0,y=0;
		fial.rightPanValue =  balanceWeights( fial.rightPan)+1 ;
	//	System.out.println("Right value"+ fial.rightPanValue);
	
		if(fial.leftPanValue<fial.rightPanValue) {
			x= (fial.rightPanValue-fial.leftPanValue);
			
			fial.leftPanValue = fial.leftPanValue+ (fial.rightPanValue-fial.leftPanValue);
		
			}
		if(fial.rightPanValue<fial.leftPanValue) {
			y = (fial.leftPanValue-fial.rightPanValue);
			
			fial.rightPanValue = fial.rightPanValue+ (fial.leftPanValue-fial.rightPanValue);
		
			}
		System.out.println(fial.WeighPanID +" "+ x +" "+y);
	}
	

	return fial.leftPanValue + fial.rightPanValue ;
	

	
	
	
}
	
	
}
public class Solution {

public static  HashMap<String,weighingScale> hooks  = new HashMap<String, weighingScale>();
static ArrayList inputdata  = new ArrayList();
	   public  static void main(String[] args) throws IOException {
		  
		   
		   //reading values from the files to balance
		   BufferedReader reader;
			try {
				
				reader = new BufferedReader(new FileReader(
						"/Users/dandereddyprasad/eclipse-workspace/dandepreparation/src/deepValue/weighingScales"));
				String line = reader.readLine();
				while (line != null) {
					
					if (line.startsWith("#")) {
						//dont do any thing
					}
					else {
						//System.out.println(line);
					  Object [] values = line.split(",");
					  inputdata.add(values);
					}
					
					// read next line
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		   
		   Weights wtObject = new Weights();
		   
//		   String wtid = "B3";
//		   int leftvalue = 7;
//		   int rightvalue  = 8;
//		   weighingScale leftobj = null;
//		   weighingScale rightobj = null;
//		   
//		   wtObject.Insert(wtid,leftobj,rightobj,leftvalue,rightvalue,hooks);
//		   
//		   String wtid1 = "B2";
//		   int leftvalue1 = 0;
//		   int rightvalue1  = 4;
//		   weighingScale leftobj1 = hooks.get("B3");
//		   weighingScale rightobj1 = null;
//		   
//		     wtObject.Insert(wtid1,leftobj1,rightobj1,leftvalue1,rightvalue1,hooks);
//		   
//		   String wtid2 = "B1";
//		   int leftvalue2 = 10;
//		   int rightvalue2  = 0;
//		   weighingScale leftobj2 =null;
//		   weighingScale rightobj2 = hooks.get("B2");
//		   
//		   
//		   weighingScale fial =       wtObject.Insert(wtid2,leftobj2,rightobj2,leftvalue2,rightvalue2,hooks);
//		   
//	
		   
		   
		   
		   weighingScale fial=null;
		   for ( int i =inputdata.size()-1;i>=0;i--) {
			Object []data =    (Object[]) inputdata.get(i);
			int leftvalue1234=0,rightvalue1234=0;
			  weighingScale leftobj1234=null,rightobj1234 = null;
			String weightid =  (String) data[0];
			
			boolean isInteger = isInteger(data[1].toString());
			
			if (isInteger) {
				   leftvalue1234 = Integer.parseInt(data[1].toString());
			}
			if (!isInteger) {
				    leftobj1234 =hooks.get(data[1].toString());
				    
			}
			
			boolean isInteger1 = isInteger(data[2].toString());
			if (isInteger1) {
				   rightvalue1234 =Integer.parseInt(data[2].toString());
			}
			if (!isInteger1) {
				    rightobj1234 =hooks.get(data[2].toString());
				   
			}
			
			
			
			//inserts the values to weighing scales 
			  fial =       wtObject.Insert(weightid,leftobj1234,rightobj1234,leftvalue1234,rightvalue1234,hooks);
		   }
		   
		//   System.out.println(fial);
		  
		   
		  //will balance the weights and prints the output
		   wtObject.callbalanceWeights(fial);
		   
	    }
	   
	   
	   //checking if it is string/integer from the file.
	   public static boolean isInteger(String s) {
		      boolean isValidInteger = false;
		      try
		      {
		         Integer.parseInt(s);
		 
		         // s is a valid integer
		 
		         isValidInteger = true;
		      }
		      catch (NumberFormatException ex)
		      {
		         // s is not an integer
		      }
		 
		      return isValidInteger;
		   } 
	   
}
