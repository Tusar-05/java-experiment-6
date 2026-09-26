//Q 1. Write a program to check whether a given String is Palindrome or not.

import java.util.Scanner;
class test{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s,s1="";
		System.out.println("enter a string");
		s= sc.nextLine();
		for(int i=s.length()-1;i>=0;i--){
			s1=s1 + s.charAt(i);
		}
		//s1 a new string revers of s 
		if(s.equals(s1)){
			System.out.println("palindromic");
		}
		else{
			System.out.println("not palindromic");
		}

	}
}