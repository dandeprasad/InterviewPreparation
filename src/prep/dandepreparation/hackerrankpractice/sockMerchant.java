package hackerrankpractice;

import java.util.Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchantmethod(int n, int[] ar) {
        int count=0;
 Arrays.sort(ar);
Boolean [] visited = new Boolean[n];
Arrays.fill(visited, Boolean.FALSE);
for(int i=0;i<n;i++){
    if(visited[i]==false){
for(int j=i+1;j<n;j++){
    if(visited[j]==false){
        if(ar[i]==ar[j]){
count=count+1;
visited[i]=true;
visited[j]=true;
break;
        }
        
    }

}}
}
return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
    	int[] ar = {1,1,3,1,2,1,3,3,3,3};
    	int n=10;
    	 

        int result = sockMerchantmethod(n, ar);

System.out.print(result);
    }
}
