//Diffe_hellman.java

import java.util.Scanner;



public class Diffe_hellman
{
    
 public static void main(String args[])
{
        
  Scanner sc=new Scanner(System.in);
        
  System.out.println("Enter p:\t");
        
  int p=sc.nextInt();
        
  System.out.println("Enter primitive root of  "+p);
        
  int g = sc.nextInt();
        
  System.out.println("Choose 1st secret no(Alice)");

  int a= sc.nextInt();
        
  System.out.println("Choose 2nd secret no(Bob)");

  int b= sc.nextInt();
        
  int A=(int)Math.pow(g,a)%p;
        
  int B=(int)Math.pow(g,b)%p;
        
  int S_A=(int)Math.pow(B,a)%p;
        
  int S_B=(int)Math.pow(A,b)%p;
        
  if(S_A == S_B)
{
             
   System.out.println("Alice and Bob can communicate with each other!!");
             
   System.out.println("They share a secret no."+S_A);
        
  }
        
  else
{
            
   System.out.println("Alice and Bob cannot communicate with each other!!");
        
  } 
    
 }

}

/*
OUTPUT:
 Enter p:
 12

 Enter primitive root of  12: 
3

 Choose 1st secret no(Alice): 
3
 
Choose 2nd secret no(Bob)
: 3

 Alice and Bob can communicate with each other!!

 They share a secret no.3
*/