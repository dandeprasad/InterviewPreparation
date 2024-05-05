package hackerearth;

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class HeapDatastructure {
public static void main(String args[] ) throws Exception {
 int heapsize = 0;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String name = br.readLine();                // Reading input from STDIN

int InitSeqSize = Integer.parseInt(name);

//initial seq
String elements  = br.readLine();
String[] initElements = elements.split(" ");

heapsize = initElements.length;

//no of queries
int noOfQueries = Integer.parseInt(br.readLine());

Integer [] initIntergers = new Integer[initElements.length +noOfQueries];

for (int conv=1;conv<=initElements.length;conv++) {
	initIntergers[conv] = 	Integer.parseInt(initElements[conv-1]);
}



initIntergers = build_heap( initIntergers ,heapsize );




//query type 
for (int i=0;i<noOfQueries;i++) {
String data = br.readLine();
String [ ] typeofQuery = data.split(" ");
if (Integer.parseInt(typeofQuery[0])==1) {
	//add the element to max
int val = 	Integer.parseInt(typeofQuery[1]);
heapsize = heapsize+1;
	initIntergers[heapsize] = val;
	
	build_heap(initIntergers , heapsize);
}
else {
	
	
	//print the output of max
	System.out.println(initIntergers[1]);
}
}

}

static Integer[] build_heap (Integer[] initIntergers , int N) {

	
	Integer[] data = initIntergers;
	 for(int i = N/2 ; i >= 1 ; i-- )
     {
		 data  =  maxheapify (data,i ,N);
     }
	 
	return data;
	
}
static Integer [] maxheapify(Integer[] initIntergers , int i , int N){
	
	if (i!=N)
	{
	int left = 2*i;
	int right = 2*i +1;
	int highest = i ;
	if (initIntergers[left]>initIntergers[i]) {
		highest = left;
	}
	 if (initIntergers[right]>initIntergers[highest]) {
		 highest = right;
	 }
	 
	 if (highest!= i) {
		Integer[] swaparr =  swap (initIntergers , i , highest); 
		maxheapify(swaparr , highest , N);
	 }}
	 return initIntergers;
}

static Integer[] swap(Integer[] initIntergers , int i , int high){
	
	int temp = initIntergers[i];
	 initIntergers[i] = initIntergers[high];
	initIntergers[high] = temp;
	return initIntergers;
}
}
