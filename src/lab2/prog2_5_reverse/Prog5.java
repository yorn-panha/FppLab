package lab2.prog2_5_reverse;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input a String: ");
		String inputString=sc.nextLine();
		char[] charArray= new char[inputString.length()];
		for(int i=inputString.length()-1,j=0;i>=0;i--,j++){
			charArray[j]=inputString.charAt(i);
		}
		String reverseString =new String(charArray);
		System.out.println("Reverse input is: "+reverseString);
		sc.close();
	}

}
