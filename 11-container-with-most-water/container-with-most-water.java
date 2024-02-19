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
            maxArea = Math.max((Math.min(height[startIndex],height[endIndex]) * (endIndex-startIndex)), maxArea);
            
            if(height[startIndex] < height[endIndex] )
            {
                startIndex++;
            }
            else
            {
                endIndex--;
            }
            
        }
        
        
        //return max area
        return maxArea; 
    }
}