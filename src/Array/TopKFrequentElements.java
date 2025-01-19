package Array;

import java.util.*;
import java.lang.*;
import org.jetbrains.annotations.NotNull;
public class TopKFrequentElements {
// Question : 
// Given an integer array nums and an integer k, return the k most frequent elements. 
// You may return the answer in any order.
// Example 1: Input: nums = [1,1,1,2,2,3], k = 2 => Output: [1,2]
// Example 2: Input: nums = [1], k = 1 => Output: [1]

// Constraints:
// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
// k is in the range [1, the number of unique elements in the array].

// soln : 
// create a map that has num:freq pairing
// create an array of arrays such that its Nth elem = array of nums of freq N
// iterate that amtrix in reverse order and fill the final array

   public int[] topKFrequent(int[] nums, int k) {
      Map<Integer, Integer> map = new HashMap<>();
      List<Integer>[] listArr = new List[nums.length+1];
      int[] res = new int[k];
      for(int num : nums){ //update frequencies in the map
         map.put(num, map.getOrDefault(num, 0)+1);
      }        
      for(int num : map.keySet()){
         if(listArr[map.get(num)] == null) listArr[map.get(num)] = new ArrayList<>(); 
         //if this freq has no elem yet -> assign a list to it 
         listArr[map.get(num)].add(num); // add the elem to that freq array
      }
      // traverse the listArr in reverse order -> higher freq elems first 
      int idx = 0;
      for(int i=nums.length; i>0; i--){
         if(listArr[i] != null){
               for(int num : listArr[i]){
                  res[idx++] = num;
                  if(idx == k) return res;
               }
         }
      }
      return res;   
   }
}
