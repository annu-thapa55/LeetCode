class Solution 
{

    //the main idea is to use sliding window technique
    public double findMaxAverage(int[] nums, int k) 
    {
        double maxAverage =0.0;
        double maxSum = 0.0;
        double currentSum = 0.0;
        

        //find the sum of first k elements (first window) and assign maxSum as the sum of these k elements
        for (int i=0; i< k; i++)
        {
            currentSum = currentSum + nums[i];

        }
        maxSum = currentSum;

        //variable for pointing to the start of the window
        int startIndx = 0; 

        // loop for sliding through other windows
        for ( int i= k; i < nums.length; i++ )
        {   
            //adding new element to the window and getting rid of first element of previous window to imitate the window slide
            currentSum = currentSum - nums[startIndx] + nums[i];
            startIndx ++;
            maxSum = Math.max(currentSum,maxSum);
        }

        //calculate and return average
        maxAverage = maxSum/k;       
        return maxAverage;



    }
}