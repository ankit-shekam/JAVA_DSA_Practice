package Array;

import java.util.*;
import java.lang.*;
import org.jetbrains.annotations.NotNull;
public class ProductOfArrExceptSelf {

  /***
   * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
   * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
   * You must write an algorithm that runs in O(n) time and without using the division operation.
   * Example 1: Input: nums = [1,2,3,4] => Output: [24,12,8,6]
   * Example 2: Input: nums = [-1,1,0,-3,3] => Output: [0,0,9,0,0]
   * Constraints:
   * 2 <= nums.length <= 105
   * -30 <= nums[i] <= 30
   * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
   */
  public int[] productExceptSelf1(@NotNull int[] nums) {
//    approach 1 : two array for prefixProduct and suffixProduct non-inclusive of that element =>
//    product of array without that is product of prefix and suffix product
//    time - O(N) (3 loops) | space - O(N)
    if(nums.length==1) return nums;
    int[] pre = new int[nums.length];
    int[] post = new int[nums.length];
    pre[0] = 1;
    post[nums.length-1]=1;
    for(int i=1; i<nums.length; i++){
      pre[i] = pre[i-1]*nums[i-1];
    }
    for(int i=nums.length-2; i>=0; i--){
      post[i] = post[i+1]*nums[i+1];
    }
    for(int i=0; i<nums.length; i++){
      nums[i] = pre[i]*post[i];
    }
    return nums;
  }

  public int[] productExceptSelf2(@NotNull int[] nums) {
//    approach 2 : instead of prefixProduct & suffixProduct arrays => use variables and update those
//    time would be - O(N) | space - O(N)
    if(nums.length==1) return nums;
    int[] ans = new int[nums.length];
    int preProduct=1, postProduct=1;
    for(int i=0; i<nums.length; i++){
      ans[i] = preProduct;
      preProduct *= nums[i];
    }
    for(int i=nums.length-1; i>=0; i--){
      ans[i] *= postProduct;
      postProduct *= nums[i];
    }
    return ans;
  }

}
