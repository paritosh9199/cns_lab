import java.io.*;

import java.util.*;

import java.lang.Math.*;



public class RSA

{
    
 public static void main(String args[])throws Exception
    
 {
        
  int p,q,r,n,g,e,m;
        
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the prime no.s : ");

  p=sc.nextInt();
        
  q=sc.nextInt();
      
  n=p*q;
      
  g=(p-1)*(q-1);
   
  for(e=2;e<g;e++)
    
  {
          
   if(gcd(e,g)==1)
      
   {
             
    break;
          
   }
     
  }
  
  System.out.println("Public key is :   "+e);
    
  int d;
  
  for(d=1;d<9;d++)
 
  {

   if((d*e)%g == 1)
  
   {
         
    break;
   
   }
    
  }
    
  System.out.println("Private key is : "+d);
     
  System.out.println("Enter msg :  ");
     
  m=sc.nextInt();
     
  double cipher=(Math.pow(m,e))%n;
     
  System.out.println("Cipher text is : "+cipher);
     
  double original=(Math.pow(cipher,d))%n;
     
  System.out.println("original text is : "+original);
    
 }
    
 static int gcd(int e,int g)
   
 {
      
  if(e==0)
      
  {
         
   return g;
      
  }
   
  else
  {
          
   return gcd(g%e,e);
      
  }
    
 }

}

/* OUTPUT */

// Enter the prime no.s : 
// 3 11

// Public key is :   3

// Private key is : 7

// Enter msg :  
// 8

// Cipher text is : 17.0

// original text is : 8.0