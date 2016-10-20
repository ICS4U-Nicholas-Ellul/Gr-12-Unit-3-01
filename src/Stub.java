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
		String lastCharacter;
		String reversedText = "";
		
		if(sentence.length() > 0){
			
			//gets part of string
			sentenceSubString = sentence.substring(0, sentence.length() - 1);
			int bob = sentence.length();
			ReverseString(sentenceSubString);
			
			//outputs it
			lastCharacter = sentence.substring(sentence.length() - 1);
			reversedText = lastCharacter + reversedText;
			System.out.println(reversedText);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		ReverseString(reader.nextLine());
	}

}
