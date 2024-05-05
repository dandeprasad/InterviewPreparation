package dandepreparation;
/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Main {
    public static int processData(ArrayList<String> array) {

    	//for maintaining the lastest version
    	HashMap dataMaintaince = new HashMap();
   
    	int Count =0;
    	
  for(int i =0;i<array.size();i++) {

	  try {
	  	String[] data=array.get(i).split(",");
	
	  	//3rd and 4th value have the values software and version
	  	String server = data[2];
	  	String version = data[3];
	  	
	  	String checkMaintaince = (String) dataMaintaince.get(server);
	  	
	  	if(checkMaintaince==null) {
	  	dataMaintaince.put(server, version);
	  	
	  	}
	  	else {
	  		
	  		//Bringing the version codes to similar lenght for comparision if not same
	  		
	  		
	  		String[] versionSplit=version.split("\\.");
	  		String[] versionSplitMaintaince=checkMaintaince.split("\\.");
	  		
	  		//converting String array to List for comparision and appending zeros at end
	  		
	  	ArrayList<String>versionSplitList=new ArrayList();
	  	ArrayList<String>versionSplitMaintainceList=new ArrayList();
	  	
	  		for (int sd=0;sd<versionSplit.length;sd++) {
	  			versionSplitList.add(versionSplit[sd]);
	  		}
	  	
			for (int sd1=0;sd1<versionSplitMaintaince.length;sd1++) {
				versionSplitMaintainceList.add(versionSplitMaintaince[sd1]);
	  		}
	  		
	  		
	  		
	  		if(versionSplitList.size() >versionSplitMaintainceList.size()) {
	  			
	  			int diff = (versionSplitList.size())-(versionSplitMaintainceList.size());
	  			
	  		
	  			for (int j=versionSplitMaintaince.length;j<(versionSplitMaintaince.length+diff);j++) {
	  				versionSplitMaintainceList.add(j,"0");
	  			}
	  		}
	  		else if(versionSplitMaintainceList.size() >versionSplitList.size()){
	int diff = (versionSplitMaintainceList.size())-(versionSplitList.size());
	
	  			for (int j=versionSplit.length;j<(versionSplit.length+diff);j++) {
	  				versionSplitList.add(j,"0");
	  			}
	  		}
	  		
	  		
	  		//comparing the version values by iterating through each one
	  		for (int k=0;k<versionSplitList.size();k++) {
	  			if((Integer.parseInt(versionSplitMaintainceList.get(k).trim()))>(Integer.parseInt(versionSplitList.get(k).trim()))) {
	  				Count++;
	  				break;
	  			}
	  			else if((Integer.parseInt(versionSplitMaintainceList.get(k).trim()))<(Integer.parseInt(versionSplitList.get(k).trim()))){
	  				dataMaintaince.put(server, version);
	  		  	 	Count++;
	  		  	break;
	  			}
	  		}
	  		
	  		

	  	
	  	}
	 
  }
  catch(Exception ex) {
	//System.out.println(ex);  
  }
	
	  }
      System.out.println(Count);
      
  return Count;    
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("/Users/dandereddyprasad/eclipse-workspace/dandepreparation/src/dandepreparation/input.txt")));
            while(in.hasNextLine()) {
                String line = in.nextLine().trim();
                if (!line.isEmpty()) // Ignore blank lines
                    inputData.add(line);
            }
            int retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("/Users/dandereddyprasad/eclipse-workspace/dandepreparation/src/dandepreparation/output.txt")));
            output.println("" + retVal);
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
