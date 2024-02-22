
class Solution 
{

    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> firstNum = new HashSet<>();
        Set<Integer> secondNum = new HashSet<>();
        Set<Integer> thirdNum = new HashSet<>();

        int j =0;
        int k=0;
        int complementRes = 0;

        Arrays.sort(nums);
            
        for(int i =0; i<nums.length; i++)
        {
            if(firstNum.contains(nums[i]))
            {
                continue;
            }
            else
            {
                firstNum.add(nums[i]);
                j= i+1;
                k= nums.length -1;

                secondNum.clear();
                thirdNum.clear();

                boolean secondNumSeen = false;
                boolean thirdNumSeen = false; 

                while(j<k)
                {
                   
 
                    if(secondNum.contains(nums[j]) && secondNumSeen)
                    {
       
                        j++;
                        continue;
                    }

                    if(thirdNum.contains(nums[k]) && thirdNumSeen)
                    {
                       
                        k--;
                       
                        continue;
                    }
                   
                 
                  
                    secondNum.add(nums[j]);
                    secondNumSeen = false;
                    thirdNum.add(nums[k]);
                    thirdNumSeen = false;

                    complementRes = -nums[j] -nums[k];
                
                    if(complementRes == nums[i])
                    {
                        List<Integer> currentRes = new ArrayList<Integer>(); 
                        currentRes.add(nums[i]);
                        currentRes.add(nums[j]);
                        currentRes.add(nums[k]);


                        result.add(currentRes);
                        j++;
                        k--;
                        secondNumSeen = true;
                        thirdNumSeen =true;
                    }

                    else if (complementRes > nums[i])
                    {
                        j++;
                        secondNumSeen = true;
                    }
                    else
                    {
                        k--;
                        thirdNumSeen =true;
                    }
                    
                }
                
            }
            
        }
        //return list of combination
        return result;

    }
}