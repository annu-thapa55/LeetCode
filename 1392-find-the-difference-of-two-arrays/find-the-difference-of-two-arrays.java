class Solution 
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {

        //list for storing the distinct integers in nums1 that are not present in nums2
        List<Integer> nums1Distinct = new ArrayList<>();

        //list for storing the distinct integers in nums2 that are not present in nums1
        List<Integer> nums2Distinct = new ArrayList<>();

        //result list containing nums1Distinct and nums2Distinct
        List<List<Integer>> result = new ArrayList<>();

        //Hash Set to store the non-duplicate keys in nums1
        Set<Integer> set1 = new HashSet<>();

        //Hash Set to store the non-duplicate keys in nums2
        Set<Integer> set2 = new HashSet<>();

        //populating set1
        for ( int num: nums1)
        {
                set1.add(num);
        }

        //populating set2
        for ( int num: nums2)
        {
            set2.add(num);
        }

        //populating nums1Distinct with non-duplicate values in nums1
        for ( int num: set1)
        {
            if (!set2.contains(num))
            {
                nums1Distinct.add(num);
            }
        }

        //populating nums2Distinct with non-duplicate values in nums2
        for ( int num: set2)
        {
            if (!set1.contains(num))
            {
                nums2Distinct.add(num);
            }
        }
        
        //adding two final lists
        result.add(nums1Distinct);
        result.add(nums2Distinct);

        //returning resultant list of the list
        return result;
    }
}