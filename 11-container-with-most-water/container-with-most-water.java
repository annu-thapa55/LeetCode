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
            int minHeight = Math.min(height[startIndex],height[endIndex]);
            maxArea = Math.max((minHeight* (endIndex-startIndex)), maxArea);
            
            while(startIndex < endIndex && height[startIndex] <= minHeight)
            {
                startIndex++;
            }
            while (startIndex < endIndex && height[endIndex] <= minHeight)
            {
                endIndex--;
            }
            
        }
        
        
        //return max area
        return maxArea; 
    }
}