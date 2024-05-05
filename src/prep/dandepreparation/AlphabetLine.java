
public class AlphabetLine {
	public static void main(String args[]){  
		String myName="MakaniKrishnakanth";    
		for(int i=0; i<myName.length();i++){  
		        char c = myName.charAt(i); 
		        
		        if(i%2==0) {
		        	System.out.println(c); 
		        	
		        }
		        else {
		        	//Adding 2 rows & 5 columns space
		        	 System.out.println("\n"+"\n"+ "     " +c); 
		        }
		       
		}   
		}
}
