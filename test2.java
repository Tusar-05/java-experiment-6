//Q 3. Given a stiring, return a new string made of 'n' copies of the first 2 chars of the orignal string where 'n' is the length of the string.

import java.util.Scanner;
public class test2{
    public static void main(String args[]){
        String s1,s2,s3,f="";
        int l;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        s1= sc.nextLine();
        s2= s1.substring(0,2);
        l= s1.length();

        for(int i=0;i<l;i++){
            f= f+ s2;
        }
        System.out.println("output:"+f);
    }
    
}