package hackerrankpractice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleyscls {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
int Down=0;int Up=0;int valley=0;
for(int i=0;i<n;i++){
    if(Down==Up){
    Down=0;Up=0;}
if(s.charAt(i)=='D'){
if(Down==Up){
    valley=valley+1;
}
Down=Down+1;
}
else if(s.charAt(i)=='U'){
Up=Up+1;
}
}
return valley;
    }


    public static void main(String[] args) throws IOException {
String s="UDDDUDUU";
int n=8;

      //  int result = countingValleys(n, s);
//System.out.print(result);
String s1="a";
long n1=1000000000;

//repeatedString(s1, n1);

int[][] arr = {
	      {1 ,1, 1, 0, 0, 0}, 
	      {0 ,1 ,0, 0, 0, 0}, 
	      {1, 1, 1, 0, 0, 0},
	      {0, 0, 2, 4, 4, 0},
	      {0, 0, 0, 2, 0, 0},
	      {0, 0, 1, 2, 4, 0}
	};

long result1 =hourglassSum(arr);

System.out.print(result1);
    }
    
    
    
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        
        long count=0;
for(int i=0;i<s.length();i++){
    if(s.charAt(i)=='a'){
count=count+1;

    }
    

}
long div = n/s.length();
long rem = n%s.length();
count = count*div;

for (int j=0;j<rem;j++) {
    if(s.charAt(j)=='a'){
count=count+1;

    }
}
return count;

    }
    
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
int Pr=0;
int rowLength=arr[0].length;
int colLength=arr.length;
int  maxValue=-999999;
while(Pr<rowLength-2){
	int Pc=0;
    while(Pc<colLength-2){
int count = arr[Pr][Pc]+arr[Pr][Pc+1]+arr[Pr][Pc+2]+arr[Pr+1][Pc+1]+arr[Pr+2][Pc]+arr[Pr+2][Pc+1]+arr[Pr+2][Pc+2];
if(count>maxValue)
maxValue=count;
Pc=Pc+1;
    }
  Pr=Pr+1;  
}
return maxValue;
    }
    
}


