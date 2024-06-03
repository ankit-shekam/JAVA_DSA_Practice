package Array;

import java.util.*;
import java.lang.*;
import org.jetbrains.annotations.NotNull;
public class ValidAnagram {
/***
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * Example 1:Input: s = "anagram", t = "nagaram" | Output: true
 * Example 2: Input: s = "rat", t = "car" | Output: false
 * Constraints:
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 */
  public static boolean isAnagram(@NotNull String s, @NotNull String t) {
    // sort both and incremental compare - time & space = O(NlogN)
    // use HashMap - time and space = O(N)
    // use freqArray since only small eng letters - space ~ O(1), time O(N)
    int[] freqArr = new int[26];
    for(int i=0; i<s.length(); i++){
      char val = s.charAt(i);
      freqArr[val-'a']++;
    }
    for(int i=0; i<t.length(); i++){
      char val = t.charAt(i);
      freqArr[val-'a']--;
    }
    for(int num : freqArr){
      if(num!=0) return false;
    }
    return true;
  }
}
