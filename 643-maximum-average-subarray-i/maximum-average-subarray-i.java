class Solution 
{

    //the main idea is to use sliding window technique
    public double findMaxAverage(int[] nums, int k) 
    {
        double maxAverage =0.0;
        double maxSum = 0.0;
        double currentSum = 0.0;
        

        //find the sum of first k elements and assign masSum as the sum of these k elements
        for (int i=0; i< k; i++)
        {
            currentSum = currentSum + nums[i];

        }
        maxSum = currentSum;

        //variable for pointing to the start of the window
        int startIndx = 0; 

        for ( int i= k; i < nums.length; i++ )
        {
            currentSum = currentSum - nums[startIndx] + nums[i];
            startIndx ++;
            maxSum = Math.max(currentSum,maxSum);
        }

        maxAverage = maxSum/k;

        
        //return average
        return maxAverage;



    }
}