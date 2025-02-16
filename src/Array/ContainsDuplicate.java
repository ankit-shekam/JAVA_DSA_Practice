package Array;

import java.util.*;
import java.lang.*;
import org.jetbrains.annotations.NotNull;

public class ContainsDuplicate {
/***
 * //Given an integer array nums, return true if any value appears at least twice in the array,
 * //and return false if every element is distinct.
 * //Example 1 : => Input: nums = [1,2,3,1] | Output: true
 * //Example 2: => Input: nums = [1,2,3,4] | Output: false
 * //Example 3: =>  Input: nums = [1,1,1,3,3,4,3,2,4,2] | Output: true
 * //Constraints:
 * //1 <= nums.length <= 10^(5)
 * //-10^(9) <= nums[i] <= 10^(9)
 */
  public static boolean containsDuplicate(int @NotNull [] nums){
    Set<Integer> hset = new HashSet<>();
    for(int num : nums){
      if(!hset.add(num)) return true; //tried inserting duplicate in the set
    }
    return false; //no duplicates
  }
  // sort - Space & time = O(NlogN)
  // use hashset - space & Time = O(N)
  // Till 10^6 -> O(NlogN) is OK
}
