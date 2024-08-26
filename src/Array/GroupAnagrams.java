package Array;

import java.util.*;
import java.lang.*;
import org.jetbrains.annotations.NotNull;
public class GroupAnagrams {

  /***
   * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
   * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
   * Example 1: Input: strs = ["eat","tea","tan","ate","nat","bat"] =>Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
   * Example 2: Input: strs = [""] => Output: [[""]]
   * Example 3: Input: strs = ["a"] => Output: [["a"]]
   *
   * Constraints:
   * 1 <= strs.length <= 104
   * 0 <= strs[i].length <= 100
   * strs[i] consists of lowercase English letters.
   */
    public List<List<String>> groupAnagrams(@NotNull String[] strs) {
//      approach: sort each word and add its unsorted version to a hashmap of list, use the sortedword as key ao that anagrams gets grouped in the map
//      time - O(N(KlogK)) | space- O(N), N-strs.length() & K-strs[i].length()
      Map<String, List<String>> map = new HashMap<>();
      for(String word:strs){
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        String sortedWord = new String(arr);
        if(!map.containsKey(sortedWord)){
          map.put(sortedWord, new ArrayList<>());
        }
        map.get(sortedWord).add(word);
        //comment added from github web portal in andoird tablet  
      }

      return new ArrayList<>(map.values());
    }
}
