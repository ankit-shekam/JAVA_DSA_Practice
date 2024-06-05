package Array;

import java.util.*;
import java.lang.*;
import org.jetbrains.annotations.NotNull;
public class DecodeEncodeString {

  public static String encode(@NotNull List<String> strs) {
    // simple hashing function => add lengthOfString with # in front of each string -> length will help while decoding and '#' will serve as a delimiter
    // i/p=["neet","code","love","you"] => o/p="4#neet4#code4#love3#you"
    StringBuilder bldr = new StringBuilder();
    for(String str:strs){
      bldr.append(str.length()).append('#').append(str);
    }
    return bldr.toString();
  }

  public static List<String> decode(@NotNull String str) {
    List<String> lst = new ArrayList<>();
    int i=0;
    while(i<str.length()){
      int j = i;
      while (str.charAt(j) != '#') j++; //to account for int values of more than 1 digit length
      int ctr = Integer.valueOf(str.substring(i, j));
      i=j+1+ctr;
      lst.add(str.substring(j+1, i));
    }
    return lst;
  }
}

/***
 * Design an algorithm to encode a list of strings to a single string.
 * The encoded string is then decoded back to the original list of strings.
 *
 * Example 1:
 * Input: ["neet","code","love","you"]
 * Output:["neet","code","love","you"]
 *
 * Example 2:
 * Input: ["we","say",":","yes"]
 * Output: ["we","say",":","yes"]
 * Constraints:
 *
 * 0 <= strs.length < 100
 * 0 <= strs[i].length < 200
 * strs[i] contains only UTF-8 characters.
 */