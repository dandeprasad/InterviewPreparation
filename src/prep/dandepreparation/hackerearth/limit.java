package hackerearth;

class speed {
	 
	 final int speedlimit=90;//final variable  
	 int run(){  
	  return speedlimit;
	 } 
}
	public class limit extends speed{
	 public static void main(String args[]){  
	 limit obj=new limit();  
	int x =  obj.run();
	
		System.out.println(x); 
		 }  
	}