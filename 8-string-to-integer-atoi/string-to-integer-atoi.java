class Solution 
{
    public int myAtoi(String s) 
    {
        //Taking care of corner cases
        if(s.length() <= 0 || s.length() >= 200)
        {
            return 0;
        }
        
        //convert the string into character array
        char[] charArr = s.toCharArray();
        
        int result = 0;
        
        boolean positive =true;
        
        int count = 0;
        
        //white space check
        while (count < charArr.length && charArr[count] ==' '  )
        {
            count++;
        }

        if(count >= charArr.length)
        {
            return 0;
        }
        
        //take care of +, - sign
        
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

        //for 0s in the beginning
        while (count < charArr.length && charArr[count] == 0)
        {
            count++;
        }
        
        // for characters
      
        int digitCount = count;
        int firstDigit = count; 
        while (digitCount < charArr.length && charArr[digitCount] >= '0' && charArr[digitCount] <= '9')
        {
            int digit = Character.getNumericValue(charArr[digitCount]); 

            if(digitCount == firstDigit)
            {
                result = digit;  
            }
            else
            {
                if ((result > Integer.MAX_VALUE / 10) || 
                (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10))
                {
                    if(positive)
                      

                        return Integer.MAX_VALUE ;
                    else
                        return Integer.MIN_VALUE;
                }
                else
                {
                    result = result *10 + digit;
                }
            }

            digitCount++;
        }
      
        
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