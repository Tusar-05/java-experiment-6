//Q 2. Write a java program that will concatenate 2 strings and return the result .The result should be in lowercase.

import java.util.Scanner;
public class test1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1,s2,s3;
		System.out.println("Enter string1");
		s1=sc.nextLine();
		System.out.println("Enter string2");
		s2=sc.nextLine();
        s3 = s1 + s2; // operator overloading 
        System.out.println("orignal string"+s3);
        String s4 = s3.toLowerCase();
        System.out.println("lowe stirng : " +s4);
		for(int i =0 ; i<s2.length();i++){
			
		}

	}
}