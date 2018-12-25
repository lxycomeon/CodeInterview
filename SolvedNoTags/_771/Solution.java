package _771;

import java.util.HashMap;
import java.util.HashSet;

/*
 * You're given strings J representing the types of stones that are jewels,
 *  and S representing the stones you have.  Each character in S is a type of stone you have.  
 * You want to know how many of the stones you have are also jewels.
	The letters in J are guaranteed distinct, and all characters in J and S are letters. 
	Letters are case sensitive, so "a" is considered a different type of stone from "A".
	
	Example 1:
	Input: J = "aA", S = "aAAbbbb"
	Output: 3
	
	Example 2:
	Input: J = "z", S = "ZZ"
	Output: 0
 */

public class Solution {

	public static void main(String[] args) {
		//System.out.println(	numJewelsInStones("A","aAZSAZA"));
		String[] test = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
		System.out.println(uniqueMorseRepresentations(test));
	}
	
	 public static int numJewelsInStones(String J, String S) {
		 char[] J_char = J.toCharArray();
		 int count  = 0;
		 for (int i = 0; i < S.length(); i++) {
			char tmp = S.charAt(i);
			for (int k = 0; k < J_char.length; k++) {
				if(tmp == J_char[k])
					count++;
			}
		}
		 return count;
	        
	    }
	 
	 /*
	  * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

		For convenience, the full table for the 26 letters of the English alphabet is given below:
		
		[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
		Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
		
		Return the number of different transformations among all words we have.
		
		Example:
		Input: words = ["gin", "zen", "gig", "msg"]
		Output: 2
		Explanation: 
		The transformation of each word is:
		"gin" -> "--...-."
		"zen" -> "--...-."
		"gig" -> "--...--."
		"msg" -> "--...--."
		
		There are 2 different transformations, "--...-." and "--...--.".
	  */
	 //804
	 public static int uniqueMorseRepresentations(String[] words) {
		 String[] lib = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		 HashSet<String> hs = new HashSet<String>();
		 for (int i = 0; i < words.length; i++) {
			String tmp = "";
			for (int j = 0; j < words[i].length(); j++) {
				tmp += lib[words[i].charAt(j)-'a'];
			}
			System.out.println(tmp);
			hs.add(tmp);
		}
		 return hs.size(); 
	    }

}
