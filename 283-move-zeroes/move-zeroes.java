class Solution 
{
    //swapping function

    public int[] swap(int index1, int index2, int[] arr)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp; 

        return arr;
    }

    public boolean isEmpty(int[] arr)
    {
        if (arr.length ==0 || arr == null)
            return true;
        else
            return false;
    }
    public void moveZeroes(int[] nums) 
    {
        //throwing null pointer exception for empty input array
        if(isEmpty(nums))
            throw new NullPointerException("Empty input array");
        
        //if the length of an array is 1, the output will be the same input array
        if(nums.length == 1)
        {
            nums = nums;
        }  
        // for the array with more than one element, perform the operation of comparing and swapping elements
        else
        {
            //varible j that points to element with value 0
            int j = 0;

            //looping through each array element using variable i
            for (int i = 0; i< nums.length; i++)
            {
                //swapping the element when j points to 0 and i points to non-zero elements
                if (nums[j] == 0 && nums[i] != 0)
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    //nums = swap(i, j, nums);
                    j++;
                }

                if( nums[j] !=0)
                {
                    j++;
                }
            }
        }
               
    }
}