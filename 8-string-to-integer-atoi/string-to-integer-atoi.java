class Solution 
{
    public int myAtoi(String s) 
    {
        //First take care of corner cases:

        //taking care of input string length constraints
        if(s.length() <= 0 || s.length() >= 200)
        {
            return 0;
        }
        
        //convert the string into character array
        char[] charArr = s.toCharArray();
        
        //extracted int value to be returned
        int result = 0;
        
        //boolean value to indicate if the input string is positive or negative
        boolean positive =true;

        //index for traversing the character array made from input string
        int count = 0;
        
        //taking care of white spaces
        while (count < charArr.length && charArr[count] ==' '  )
        {
            count++;
        }

        //returning 0 for the string with only white spaces
        if(count >= charArr.length)
        {
            return 0;
        }
        
        //taking care of +, -, or none symbol after spaces
        if(count < charArr.length && charArr[count] == '-')
        {
            positive = false; 
            count++;
        }
        
        else if (count < charArr.length && charArr[count] == '+' )
        {
            positive = true; 
            count++;
        }

        //taking care of 0s after the +, - or spaces
        while (count < charArr.length && charArr[count] == 0)
        {
            count++;
        }
        
        //starting the digit extraction
      
        //variable for traversing the character array and extracting the digits
        int digitCount = count;

        //variable for identifying the first digit
        int firstDigit = count; 
        while (digitCount < charArr.length && charArr[digitCount] >= '0' && charArr[digitCount] <= '9')
        {
            //extracting the digit from character array
            int digit = Character.getNumericValue(charArr[digitCount]); 

            //calculating result for the first digit
            if(digitCount == firstDigit)
            {
                result = digit;  
            }

            //calculating result for non-first exracted digits
            else
            {
                //checking the stack overflow condition before multiplying previous result by 10 and adding current extracted digit
                if ((result > Integer.MAX_VALUE / 10) || 
                (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10))
                {
                    if(positive)
                      
                        return Integer.MAX_VALUE ;
                    else
                        return Integer.MIN_VALUE;
                }
                
                // calculating result in non-overflow condition
                else
                {
                    result = result *10 + digit;
                }
            }

            // incrementing the traversing index by 1
            digitCount++;
        }
      
        
        // returning result in terms of + or - sign in input string
        if(positive)
        {
            return result;
        }

        else 
        {
            return -1* result; 
        }
  
            
    }
        
        
}