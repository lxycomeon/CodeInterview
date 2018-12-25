package _535;

import java.util.HashMap;
import java.util.Map;

/*
 *
 *	TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl 
 *	and it returns a short URL such as http://tinyurl.com/4e9iAk.

	 Design the encode and decode methods for the TinyURL service.
	 There is no restriction on how your encode/decode algorithm should work. 
	 You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
	思考：hashmap 和hashcode的应用 
*/

public class Solution {

	private static Map<String,String> map = new HashMap<String,String>();
	public static void main(String[] args) {
		System.out.println(encode("https://leetcode.com/problems/design-tinyurl"));
		System.out.println(decode(encode("https://leetcode.com/problems/design-tinyurl")));

	}
	  // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
		Integer hash = longUrl.hashCode();	
		map.put(hash.toString(), longUrl);
    	return "http://tinyurl.com/"+hash;
        
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
		String[] arr = shortUrl.split("/");
		String hash = arr[arr.length-1];
    	return map.get(hash);
        
    }
}

