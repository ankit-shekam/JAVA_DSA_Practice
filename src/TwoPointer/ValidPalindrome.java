package TwoPointer;

import java.util.*;
import java.lang.*;
import org.jetbrains.annotations.NotNull;
public class ValidPalindrome {
  public boolean isPalindrome(@NotNull String s) {
    // two pointer will yeild - space O(1) | time O(N)
    // as per the requirement toLowerCase() & include a-z, 0-9 for valid
    if(s.length()<2)  return true;
    s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    int start=0;
    int end = s.length()-1;
    while(start<end){
      if(s.charAt(start) != s.charAt(end)) return false;
      start++;
      end--;
    }
    return true;
  }
}
