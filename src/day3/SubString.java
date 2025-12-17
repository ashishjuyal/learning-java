package day3;

import java.util.Iterator;


/**
 * 
 *  sumOfLetters("")          => 0
	sumOfLetters("a")         => 1
	sumOfLetters("z")         => 26
	sumOfLetters("cab")       => 6
	sumOfLetters("excellent") => 100
 * */
public class SubString {

	public static void main(String[] args) {
		String city = "new delhi";
		char[] cityArray = city.toCharArray();
		
		System.out.println(city.length());
		
		for(int i=0; i < cityArray.length; i++) {
			
			System.out.println((int)cityArray[i]);
		}
	}

}
