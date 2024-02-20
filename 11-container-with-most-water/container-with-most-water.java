class Solution 
{
    public int maxArea(int[] height) 
    {
        
        //max area
        int maxArea =0;
        
        //two pointers to iterate height array. One at the beginning of array and another at end of array.
        
        int startIndex = 0;
        
        int endIndex = height.length -1;
        
        
        //iterate through height array
        while (startIndex < endIndex)
        {
            //minimum height pointed by startIndex, and endIndex as the minimum height between two heights is taken into consideration for water area
            int minHeight = Math.min(height[startIndex],height[endIndex]);

            //max area selected between current area and maxArea so far
            maxArea = Math.max((minHeight* (endIndex-startIndex)), maxArea);
            
            //iterate startIndex until the height pointed by it is smaller than the minHeight because smaller height won't contribute to the maxArea. 
            while(startIndex < endIndex && height[startIndex] <= minHeight)
            {
                startIndex++;
            }
            //iterate endIndex for the same reason
            while (startIndex < endIndex && height[endIndex] <= minHeight)
            {
                endIndex--;
            }
            
        }
        
        
        //return max area
        return maxArea; 
    }
}