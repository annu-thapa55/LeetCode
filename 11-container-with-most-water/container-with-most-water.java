class Solution 
{
    public int maxArea(int[] height) 
    {
        //corner cases
        
        if ( height.length< 2 || height.length > Math.pow(10,5))
        {
            return 0;
        }
        //max area
        int maxArea =0;
        
        int currentArea = 0;
        
        //two pointers to iterate height array. One at the beginning of array and another at end of array.
        
        int startIndex = 0;
        
        int endIndex = height.length -1;
        
        int tankLength = height.length -1; 
        
        //iterate through height array
        
        while (startIndex < endIndex)
        {
          
            if(height[startIndex] <0 || height[endIndex] <0|| height[startIndex]> Math.pow(10,4) ||         height[endIndex] > Math.pow(10,4))
            {
                return 0; 
            }
            
            currentArea = Math.min(height[startIndex],height[endIndex]) * tankLength;
            maxArea = Math.max(currentArea, maxArea);
            
            tankLength --;
            
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