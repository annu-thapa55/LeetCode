class Solution 
{

    public double findMaxAverage(int[] nums, int k) 
    {
       

        double maxSum = 0.0;
        double currentSum = 0.0;
        

        //find the sum of first k elements
        for (int i=0; i< k; i++)
        {
            currentSum = currentSum + nums[i];

        }
        maxSum = currentSum;

        int count = 0; 

        for ( int i= k; i < nums.length; i++ )
        {
            currentSum = currentSum - nums[count] + nums[i];
            count ++;
            maxSum = Math.max(currentSum,maxSum);
        }

        
        //return average
        return maxSum/k;



    }
}