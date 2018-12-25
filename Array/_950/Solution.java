package _950;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/*
 * In a deck of cards, every card has a unique integer. 
 *  You can order the deck in any order you want.
Initially, all the cards start face down (unrevealed) in one deck.
Now, you do the following steps repeatedly, until all cards are revealed:
Take the top card of the deck, reveal it, and take it out of the deck.
If there are still cards in the deck, put the next top card of the deck at the bottom of the deck.
If there are still unrevealed cards, go back to step 1.  Otherwise, stop.
Return an ordering of the deck that would reveal the cards in increasing order.

The first entry in the answer is considered to be the top of the deck.
 */


public class Solution {

	public static void main(String[] args) {
		
		int[] nums = {17,13,11,2,3,5,7};
		deckRevealedIncreasing(nums);
	
		
		
	}
	
	 public static int[] deckRevealedIncreasing(int[] deck) {
		 int N = deck.length;
	        Deque<Integer> index = new LinkedList();
	        for (int i = 0; i < N; ++i)
	            index.add(i);

	        int[] ans = new int[N];
	        Arrays.sort(deck);
	        for (int card: deck) {
	            ans[index.pollFirst()] = card;
	            if (!index.isEmpty())
	                index.add(index.pollFirst());
	        }

	        return ans;
	        
	 }
	


}

