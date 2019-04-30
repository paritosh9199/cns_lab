//SubstitutionCipher.java

import java.io.*;
import java.util.*;

public  class SubstitutionCipher{
 static Scanner sc = new Scanner(System.in);
 static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
 public static void main(String args[]) throws IOException{
     String a= "abcdefghijklmnopqrstuvwxyz";
     String b= "zyxwvutsrqponmlkjihgfedcba";
     System.out.println("Enter Any String:\t");
     String str=br.readLine();
     String decrypt="";
     char c;
    for(int i=0;i<str.length();i++){
         c=str.charAt(i);
        int j=a.indexOf(c);
        decrypt=decrypt+b.charAt(j);
    }
    System.out.println("The Encrypted String is:\t" + decrypt);
 }
}

/*
OUTPUT:
 Enter Any String: 
aecho

 The Encrypted String is: zvxsl
*/  