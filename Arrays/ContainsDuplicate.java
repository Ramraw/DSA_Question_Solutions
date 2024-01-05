class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        if(nums.length <= 1) {
            return false;
        }

        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}

// using hashset

class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<Integer>();

       for(int i=0; i < nums.length; i++) {
           if(set.contains(nums[i])) {
               return true;
           }
           set.add(nums[i]);
       }
       return false;
    }
}

// using hashmap

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        
        if(map.get(nums[i]) > 1) {
           return true;
        }
        }
        return false;
    }
}