import java.util.*;
public class CountOfNumbers {
	
		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter N number");
			int numberN = sc.nextInt();
			
			
			int evenCount = 0;
			int oddCount =0;
			int primeCount =0;
			int compoisiteCount = 0;
			for(int i = 1;i <= numberN;i++)
			{
				if(i % 2 != 0)
				{
					oddCount++;
				}
				else {
					evenCount++;
				}
			}
			int count;
			for(int j=1;j<=numberN;j++)
			{
				count=0;
			for(int i1=1;i1<=j;i1++)
			{
			   if(j%i1==0)
			   {count++;}
			}
			if(count==2) {
				primeCount++;
			}else {
				compoisiteCount++;
			}
			           
			}
			
		
			System.out.println("The Count Of Odd Numbers are:" + oddCount);
			System.out.println("The Count Of Even Numbers are:" + evenCount);
			System.out.println("The Count Of Prime Numbers are:" + primeCount);
			System.out.println("The Count Of Composite Numbers are:" + compoisiteCount);
			
		}
}
