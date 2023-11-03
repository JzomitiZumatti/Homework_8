package secondTask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        return nums.length != numbers.size();
    }
    /*public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int currentNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (currentNumber == nums[i]) {
                return true;
            } else {
                currentNumber = nums[i];
            }
        }
        return false;
    }*/

    /*public boolean containsDuplicate(int[] nums) {
        List<Integer> numbers = Arrays.stream(nums).boxed().toList();
        List<Integer> distinctNumbers = numbers.stream().distinct().collect  (Collectors.toList());
        return numbers.size() != distinctNumbers.size();
    }*/
}
