package hackerearth;


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class WeInvest {
    static int SeatNo=1;
    
public static void main(String args[] ) throws Exception {
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name = br.readLine();                // Reading input from STDIN
    
    int [][] userdata = { {3,4}, {4,5}, {2,3}, {3,4} };
    

    
  int[] leftarr  =   userdata[0];
  int [] rightarr = userdata[userdata.length -1];
  
  int[][] middlearr=new int[0][userdata.length-2];

  int i = 1;
  while (i<=userdata.length-2) {
	  middlearr[0][i-1]= userdata[0][i];
	  i++;
  }
  
  
  leftseatArnge(leftarr);

}

static void leftseatArnge(int [] leftarr){
	
	for (int i=0;i<leftarr[1];i++) {
		for (int j=0;j<leftarr[0];j++) {
			
			if (i==0) {
				Seat("W",SeatNo);
			}
		}
	}
	
}

class Seat {
	
	String SeatType;
	int SeatNo;
	String UserNo;
	
	Seat(String SeatType , int SeatNo){
		this.SeatType = SeatType;
		this.SeatNo = SeatNo;
		}
	
	void setUserNo(){
		this.UserNo = UserNo;
	}
}

}
