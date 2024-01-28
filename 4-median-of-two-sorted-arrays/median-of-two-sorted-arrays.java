class Solution 
{
    public boolean isEmpty(int[] arr)
    {
       if(arr.length == 0 || arr == null )
            return true;
        else
            return false; 
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {

      
        //sizes of two arrays
        int nums1Size = nums1.length;
        int nums2Size = nums2.length;

        //total number of elements in both array
        int numberOfElements = nums1Size+ nums2Size;

        //size of the merged array is made half the total number of elements plus 1 to fit cases for both odd and even number of elements
        int mergedArrSize = (numberOfElements/2) +1;

        //array of size mergedArrSize. This array will contain the resultant sorted elements from both arrays after comparison
        int[] allElements = new int [mergedArrSize];

        //traverse first input array with i, second input array with j and the merged array with k
        int i = 0;
        int j = 0; 
        int k = 0;

        if(isEmpty(nums1))
        {
            int medianIndex = numberOfElements /2; 

            if(nums2.length ==1)
            {
                return nums2[0];
            }
        
            else if( numberOfElements %2 == 1)
            {
                
                return nums2[medianIndex];
            }
            else
            {
                double result = ((double)nums2[medianIndex] + (double)nums2[medianIndex-1]) /2;
                return result;
            }
        }

        
        if(isEmpty(nums2))
        {
            int medianIndex = numberOfElements /2; 

            if(nums1.length ==1)
            {
                return nums1[0];
            }
            else if( numberOfElements %2 == 1)
            {
                
                return nums1[medianIndex];
            }
            else
            {
                double result = ((double)nums1[medianIndex] + (double)nums1[medianIndex-1]) /2;
                return result;
            }
        }

        if(isEmpty(nums1) && isEmpty(nums2))
        {
            return 0.0;
        }

        if(nums1.length ==1 && nums2.length ==1)
        {
            double result = ((double)(nums1[0] + (double)nums2[0]) /2);
            return result;
        }

        //keep on adding the elements in resultant merged array from any of the two arrays through comparison
        while ( i < nums1Size && j < nums2Size && k < mergedArrSize)
        {
            if(nums1[i] <= nums2[j])
            {
                allElements[k] = nums1[i];
                i++;
            }
            else
            {
                allElements[k] = nums2[j];
                j++;
            }
            k++;
        }

        //if first array is exhausted
        while ( j < nums2Size && k < mergedArrSize)
        {
            allElements[k] = nums2[j];
            j++;
            k++;
        }


        //if second array is exhausted
        while ( i < nums1Size && k < mergedArrSize)
        {
            allElements[k] = nums1[i];
            i++;
            k++;
        }

        // if the total number of elements is odd, return the last element of merged array as this will be the median
        if( numberOfElements %2 == 1)
        {
            return allElements[k-1];
        }
         //if the total number of elements is even, median is the average of two middle elements. Hence return the average of last two elements elements
        else
        {
            double result = ((double)allElements[k-1] + (double)allElements[k-2]) /2;
            return result;
        }
            
    }
}