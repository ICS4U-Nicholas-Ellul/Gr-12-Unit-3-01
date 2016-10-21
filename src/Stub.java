/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Oct 2016
 * This program uses recursion to reverse an array.
 *    
 ****************************************************************************/

import java.util.Scanner;

public class Stub {
	
	public static void ReverseString(String sentence){
		
		String sentenceSubString;
		char lastCharacter;
		String reversedText = "";
		
		String word = "";
		
		if(sentence.length() > 0){
			
			//gets part of string
			sentenceSubString = sentence.substring(1, (sentence.length()));
			ReverseString(sentenceSubString);
			
			//outputs it
			lastCharacter = sentence.charAt(0);
			reversedText =  reversedText + lastCharacter;
			
			System.out.print(reversedText);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		ReverseString(reader.nextLine());
	}

}
