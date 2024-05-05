package dandepreparation;

import java.io.*;
import java.util.Scanner;


class fibanocci {
  public static void main (String[] args) {
    
  System.out.println("enter the element for febanocci series");
    
    Scanner scan = new Scanner(System.in);
    
    
    
 int numberTosend = 5 ;
    
 fibanocci callmethod = new fibanocci();
    
    
  System.out.println(callmethod.febanocci(numberTosend));
    
  }
  
 int febanocci(int number){
   
   if (number <= 1){
     return number;
   }
  return  febanocci(number-1)+febanocci(number-2);
 }
}