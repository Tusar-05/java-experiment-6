// Q 4. Write a java program that will return the first half of th string ,if the length of the string is even. it should return odd for odd length string.

import java.util.Scanner;
public class test3{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        if(str.length()%2 == 0){
            int half = str.length()/2;
        }
        else{
            System.out.println("null");
        }
    }
}